import sys


def permute(string, step=0):
    # If we've gotten to the end, print the permutation.
    if step == len(string):
        return ["".join(string)]
    result = []
    # Everything to the right of step has not been swapped yet.
    for i in range(step, len(string)):
        # Copy the string (store as array).
        string_copy = [character for character in string]
        # Swap the current index with the step.
        string_copy[step], string_copy[i] = string_copy[i], string_copy[step]
        # Recurse on the portion of the string that has not been swapped yet (now it's index will
        # begin with step + 1).
        result += permute(string_copy, step + 1)
    return result


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage %s <word>")
        sys.exit(1)
    print(permute(sys.argv[1]))
