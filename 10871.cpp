#include <iostream>
using namespace std;

int main() {
  int n = 5, x = 2, a;
  int arr[10001];
  int arr_index = 0;

  cin >> n >> x;

  for (int i = 0; i < n; i++) {
    cin >> a;
    if (x > a) {
      arr[arr_index++] = a;
    }
  }

  for (int i = 0; i < arr_index; i++) {
    cout << arr[i] << " ";
  }

  return 0;
}