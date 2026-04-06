#include <stdio.h>
#include <time.h>

#define SIZE 10000

/* Linear Search Function */
int linearSearch(float arr[], float key, int *iterations)
{
    int i;
    *iterations = 0;

    for(i = 0; i < SIZE; i++)
    {
        (*iterations)++;

        printf("LS Checking Index: %d\n", i);

        if(arr[i] == key)
            return i;
    }

    return -1;
}

/* Binary Search Function */
int binarySearch(float arr[], float key, int *iterations)
{
    int low = 0, high = SIZE - 1;
    *iterations = 0;

    while(low <= high)
    {
        (*iterations)++;

        int mid = (low + high) / 2;

        printf("BS Checking Index: %d\n", mid);

        if(arr[mid] == key)
            return mid;
        else if(arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}

int main()
{
    float A[SIZE];
    int i;

    /* Initialize array with values 0 to 9999 */
    for(i = 0; i < SIZE; i++)
        A[i] = i;

    float key;
    int position, iterations;

    printf("Enter search key: ");
    scanf("%f", &key);

    /* ---------- Linear Search ---------- */

    clock_t startLS = clock();

    position = linearSearch(A, key, &iterations);

    clock_t endLS = clock();

    double timeLS = ((double)(endLS - startLS) / CLOCKS_PER_SEC) * 1000000;

    printf("\n--- Linear Search Result ---\n");

    if(position == -1)
        printf("Position: Not Found (-1)\n");
    else
        printf("Position: %d\n", position);

    printf("Iterations: %d\n", iterations);
    printf("Search Time (microseconds): %.2lf\n", timeLS);



    /* ---------- Binary Search ---------- */

    clock_t startBS = clock();

    position = binarySearch(A, key, &iterations);

    clock_t endBS = clock();

    double timeBS = ((double)(endBS - startBS) / CLOCKS_PER_SEC) * 1000000;

    printf("\n--- Binary Search Result ---\n");

    if(position == -1)
        printf("Position: Not Found (-1)\n");
    else
        printf("Position: %d\n", position);

    printf("Iterations: %d\n", iterations);
    printf("Search Time (microseconds): %.2lf\n", timeBS);

    return 0;
}
