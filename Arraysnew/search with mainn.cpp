# include<iostream>
using namespace std;
// SEARCH AN ELEMENT IN AN ARRAY//
int main()
{
	int n;
	int x;
	cin >> x;
	int arr[n];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	for (int i = 0; i < n; i++)
	{
		if (arr[i] == x)
		{
			return 1;

		}
	}
	return -1;
}