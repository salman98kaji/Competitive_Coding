#include<iostream>
#include<cctype>
using namespace std;

// int main(){
//     int a=10,b=20,c=30;
//     cout<<"The greatest among three num is :";
//     if(a>=b && a>=c){
//         cout<<a<<endl;
//     }
//     else if(b>=a && b>=c){
//         cout<<b<<endl;
//     }
//     else{
//         cout<<c<<endl;
//     }
//     return 0;
// }

// int main(){
//     int a=21;
//     if (a % 2 == 0){
//         cout<<"even"<<endl;
//     }
//     else{
//         cout<<"odd"<<endl;
//     }
// }

// int main(){
//     char ch;
//     ch='a';
//     cout<<"The ascii value of "<<ch<<" is "<<int(ch)<<endl;
//     return 0;
// }

// int main(){
//     char ch;
//     cout<<"enter a character = ";
//     cin>>ch;
//     switch (ch){
//         case 'a':
//         case 'e':
//         case 'i':
//         case 'o':
//         case 'u':
//         case 'A':
//         case 'E':
//         case 'I':
//         case 'O':
//         case 'U':
//           cout<<ch<<" is a vowel "<<endl;
//           break; 
//         default:
//             cout<<ch<<" is not vowel"<<endl;
//     }
// }

// int main(){
//     char ch;
//     cout<<"enter a character = ";
//     cin>>ch;
//     if(isalpha(ch)){
//         cout<<ch<<" is an alphabetic letter"<<endl;
//     }else{
//         cout<<ch<<" is an not alphabetic letter"<<endl;
//     }
//     return 0;
// }

// int main(){
//     char str[] = "hello world";
//     int i = 0;
//     //Loop through the string until we encounter the null character
//     while(str[i] != '\0'){
//         i++;
//     }
//     cout<<" the length of the string is = "<<i<<endl;
//     return 0;
// }

// int main(){
//     string str = "Geeksforgeeks";
//     int length = 0;
//     for(int i=0; str[i]!='\0'; i++){
//         length++;
//     }
//     cout<<"The lengt of the string is = "<<length<<endl;
//     return 0;
// }

// int main(){
//     string str = "GeeksForGeeks";
//     for(int i=0; str[i]!='\0'; i++){
//         if(islower(str[i])){
//             str[i]=toupper(str[i]);
//         }
//         else if (isupper(str[i])){
//             str[i]=tolower(str[i]);
//         }
//     }
//     cout<<"Toggled string : "<<str<<endl;
//     return 0;
// }

// int main(){
//     string str;
//     int vowelCount=0;
//     cout<<"enter a string: ";
//     getline(cin, str);
//     for(int i=0; i< str.length(); i++){
//         char ch = tolower(str[i]);
//         if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//             vowelCount++;
//         }
//     }
//     cout<<"nomber of vowels are : "<<vowelCount<<endl;
// }

// int main(){
//     string str;
//     string result=" ";
//     cout<<"Enter a string ";
//     getline(cin,str);
//     for(int i=0;i<str.length();i++){
//         char ch = tolower(str[i]);
//         if(ch != 'a' && ch !='e' && ch!='i'&& ch!='o' && ch!='u'){
//             result+=str[i];
//         }
//     }
//     cout<<result;
// }

// int  main(){
//     char str[100];
//     char result[100];
//     int j=0;
//     cout<<"ENter a string: "<<endl;
//     cin.getline(str,100);
//     for(int i=0; str[i] != '\0'; i++){
//         if((str[i]>='a' && str[i]<='z') ||(str[i]>='A' && str[i]<='Z')){
//             result[j]=str[i];
//             j++;
//         }
//     }
//     cout<<result;
// }

// int main(){
//     char str[100];
//     char result[100];
//     int j=0;
//     cout<<"ENter a string with space= ";
//     cin.getline(str,100);
//     for(int i=0; str[i]!='\0'; i++){
//         if(str[i]!=' '){
//             result[j]=str[i];
//             j++;
//         }
//     }
//     cout<<result;
// }

// int main(){
//     int fact=1;
//     int num;
//     cout<<"Enter a num = ";
//     cin>>num;
//     while(num>1){
//         fact*=num;
//         num--;
//     }
//     cout<<fact;
// }

// int main(){
//    int n;
//    bool isPrime=true;
//    cout<<"Enter a number: ";
//    cin>>n;
//    if(n<2){
//     isPrime=false;
//    }else{
//    for(int i=2; i<=n/2; i++){
//      if(n%i == 0){
//         isPrime=false;
//         break;
//      }
//    }
// }
//     if(isPrime){
//         cout<<n<<" is Prime number"<<endl;
//     }else{
//         cout<<n<<" is not prime"<<endl;
//     }
//     return 0;
// }

// int main(){
//     int n, original, reversed=0, remainder;
//     cout<<"ENter a number : ";
//     cin>>n;
//     original=n;
//     while(n!=0){
//         remainder=n%10;
//         reversed=reversed*10+remainder;
//         n = n/10;
//     }
//     if(original==reversed)
//         cout<<original<<" is a palindrome";
//     else
//         cout<<original<<" is not palindrome";
// }

int main(){
    string str = "Hello, World";
    int n = str.length();
    cout<<n;
    for(int i=0; i<n/2; i++){
        swap(str[i], str[n-i-1]);
    }
    cout<<"Reversed string : "<<str<<endl;
}