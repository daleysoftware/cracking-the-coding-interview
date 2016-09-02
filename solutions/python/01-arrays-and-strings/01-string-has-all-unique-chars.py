import sys


def has_all_unique_chars(word):
    letters_map = {}

    for character in word:
        if character in letters_map:
            return False
        else:
            letters_map[character] = True
    return True


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage %s <word>" % sys.argv[0])
        sys.exit(1)
    print(has_all_unique_chars(sys.argv[1]))
