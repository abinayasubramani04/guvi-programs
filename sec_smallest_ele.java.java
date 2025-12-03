#include <stdio.h>
#include <limits.h>
int main() {
    int N;
    scanf("%d", &N);

    if (N < 2) {
        printf("-1");
        return 0;
    }
    int num;
    int smallest = INT_MAX;
    int second_smallest = INT_MAX;
    for (int i = 0; i < N; i++) {
        scanf("%d", &num);

        if (num < smallest) {
            second_smallest = smallest;
            smallest = num;
        } else if (num > smallest && num < second_smallest) {
            second_smallest = num;
        }
    }
    if (second_smallest == INT_MAX)
        printf("-1");
    else
        printf("%d", second_smallest);
    return 0;
}

