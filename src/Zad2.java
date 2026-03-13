
public void findProfit(int[] array) {
    int maxWorth = 0;
    int buyDay = 0;
    int sellDay = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = i; j < array.length; j++) {
            if (array[j] - array[i] > maxWorth) {
                maxWorth = array[j] - array[i];
                buyDay = i;
                sellDay = j;
            }
        }
    }

    if (maxWorth == 0) {
        System.out.println("-1 Nie można osiągnąć zysku");
    } else {
        System.out.println("Zysk: " + maxWorth);
    }
}

void main() {
    int[] array = {44, 30, 24, 32, 35, 30, 40, 38, 15};
    int[] array2 = {10,9,8,2};

    findProfit(array);
    findProfit(array2);
}



