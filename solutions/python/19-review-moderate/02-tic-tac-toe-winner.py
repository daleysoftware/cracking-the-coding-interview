from enum import Enum


class SquareState(Enum):
    x = 1
    o = 2
    empty = 3


class Board:
    def __init__(self, state):
        """
        :param state: a 3x3 array of SquareStates. 3 rows, 3 columns.
        """
        self.state = state

    def has_winner(self):
        # Rows.
        for r in range(3):
            if self.state[r][0] == self.state[r][1] == self.state[r][2]:
                if self.state[r][0] != SquareState.empty:
                    return True
        # Columns.
        for c in range(3):
            if self.state[0][c] == self.state[1][c] == self.state[2][c]:
                if self.state[0][c] != SquareState.empty:
                    return True
        # Diagonals.
        if self.state[0][0] == self.state[1][1] == self.state[2][2]:
            if self.state[0][0] != SquareState.empty:
                return True
        if self.state[0][2] == self.state[1][1] == self.state[2][0]:
            if self.state[0][0] != SquareState.empty:
                return True
        # Else.
        return False


def main():
    s1 = [
        [
            SquareState.x,
            SquareState.x,
            SquareState.x
        ],
        [
            SquareState.o,
            SquareState.empty,
            SquareState.o
        ],
        [
            SquareState.o,
            SquareState.empty,
            SquareState.empty
        ]
    ]

    b1 = Board(s1)
    print(b1.has_winner())


if __name__ == '__main__':
    main()