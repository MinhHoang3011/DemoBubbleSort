public class BubbleSort {
    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    // Đổi chỗ phần tử arr[j+1] và arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Truyền dữ liệu và in kết quả
    public static void main(String args[]) {
        BubbleSort bs = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Mảng ban đầu: ");
        bs.printArray(arr);
        bs.bubbleSort(arr);
        System.out.println( "Mảng sau khi sắp xếp: ");
        bs.printArray(arr);
    }
}
