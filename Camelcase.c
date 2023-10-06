//Camel case of a given sentence

#include <iostream>
#include <cctype> // Include this for the toupper() function
using namespace std;

string compare(string str)
{
    int n = str.length();
    int ind = 0;
    
    for (int i = 0; i < n; i++)
    {
        if (str[i] == ' ')
        {
            str[i + 1] = toupper(str[i + 1]);
            continue;
        }
        else
        {
            str[ind++] = str[i];
        }
    }
    
    // Return the modified string
    return str.substr(0, ind);
}

int main()
{
    string input;
    cout << "Enter the string:" << endl;
    getline(cin, input); // Read the entire input line
    
    cout << compare(input) << endl;
    
    return 0;
}
