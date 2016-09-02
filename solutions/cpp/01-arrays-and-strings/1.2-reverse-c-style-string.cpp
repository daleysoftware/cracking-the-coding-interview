#include <iostream>
#include <string.h>

void reverse(char* word)
{
    int length = strlen(word);
    for (int i = 0; i < length / 2; i++) {
        char tmp = word[i];
        word[i] = word[length-1-i];
        word[length-1-i] = tmp;
    }
}

int main(int argc, char** argv)
{
    if (argc != 2) {
        std::cout << "Usage: " << argv[0] << " <word>" << std::endl;
    }

    char* word = argv[1];
    reverse(word);
    std:: cout << word << std::endl;
}
