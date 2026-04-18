#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX_SIZE 7
#define EMPTY 0
#define OCCUPIED 1
#define DELETED 2

typedef struct {
char key[100];
int status;
} HashTable;

HashTable table[MAX_SIZE];

int hashFunction(char *str) {
int alphabets = 0, digits = 0, symbols = 0;

for (int i = 0; str[i] != '\0'; i++) {
if (isalpha(str[i]))
alphabets += str[i];
else if (isdigit(str[i]))
digits += str[i];
else
symbols += str[i];
}

int hash = (alphabets + 3 * digits + 5 * symbols + 7) % MAX_SIZE;
return hash;
}

void display() {
printf("\n--- Full Hash Table ---\n");
for (int i = 0; i < MAX_SIZE; i++) {
printf("%d: ", i);
if (table[i].status == EMPTY)
printf("EMPTY\n");
else if (table[i].status == DELETED)
printf("DELETED\n");
else
printf("%s\n", table[i].key);
}
}

void insertLinear(char *key) {
int index = hashFunction(key);
int start = index;

while (table[index].status == OCCUPIED) {
index = (index + 1) % MAX_SIZE;
if (index == start) {
printf("Hash table full!\n");
return;
}
}

strcpy(table[index].key, key);
table[index].status = OCCUPIED;
printf("Key %s added at index %d\n", key, index);
}

void insertQuadratic(char *key) {
int index = hashFunction(key);
int i = 0;

while (table[(index + i * i) % MAX_SIZE].status == OCCUPIED) {
int newIndex = (index + i * i) % MAX_SIZE;
printf("Collision detected @index %d for key:%s, Occupied by:%s\n",
newIndex, key, table[newIndex].key);
i++;
if (i == MAX_SIZE) {
printf("Hash table full!\n");
return;
}
}

int finalIndex = (index + i * i) % MAX_SIZE;
strcpy(table[finalIndex].key, key);
table[finalIndex].status = OCCUPIED;
printf("Key %s added at index %d\n", key, finalIndex);
}

void search(char *key) {
int index = hashFunction(key);
int i = 0;

while (i < MAX_SIZE) {
int pos = (index + i) % MAX_SIZE;

if (table[pos].status == EMPTY) {
printf("Key not Found!!\n");
return;
}

if (table[pos].status == OCCUPIED && strcmp(table[pos].key, key) == 0) {
printf("Key found!!\n");
return;
}

i++;
}

printf("Key not Found!!\n");
}

void deleteKey(char *key) {
int index = hashFunction(key);
int i = 0;

while (i < MAX_SIZE) {
int pos = (index + i) % MAX_SIZE;

if (table[pos].status == EMPTY) {
printf("Key not Found!!\n");
return;
}

if (table[pos].status == OCCUPIED && strcmp(table[pos].key, key) == 0) {
table[pos].status = DELETED;
printf("Deleted %s\n", key);
return;
}

i++;
}

printf("Key not Found!!\n");
}

int main() {
int choice, method;
char key[100];

printf("Name:Kushagra Agrawal\n");
printf("ID: 2024ACPS0280U\n");

for (int i = 0; i < MAX_SIZE; i++)
table[i].status = EMPTY;

printf("\nChoose Probing Method:\n1. Linear\n2. Quadratic\n");
scanf("%d", &method);

while (1) {
printf("\nEnter choice: 1.Add 2.Search 3.Delete 4.Display 5.Exit: ");
scanf("%d", &choice);

switch (choice) {
case 1:
printf("Enter string: ");
scanf("%s", key);
if (method == 1)
insertLinear(key);
else
insertQuadratic(key);
break;

case 2:
printf("Enter string to search: ");
scanf("%s", key);
search(key);
break;

case 3:
printf("Enter string to delete: ");
scanf("%s", key);
deleteKey(key);
break;

case 4:
display();
break;

case 5:
return 0;
default:
printf("Invalid choice\n");
}
}
}
