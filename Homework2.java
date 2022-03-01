package Homework2;

public class Homework2 {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},

        };

            try {
                int result = method(arr);
                System.out.println();
            } catch (MyArraySizeException e) {
                System.out.println("Неправильный размер массива");
            } catch (MyArrayDataException e) {
                System.out.println("Неверные данные находятся в ячейке " + e.i + e.k);
            }
        }



        public static int method (String[][]arr) throws MyArraySizeException, MyArrayDataException {
            int result = 0;
            if (arr.length != 4) throw new MyArraySizeException("Неправильный размер массива");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException("Неправильный размер массива");
                for (int k = 0; k < arr[i].length; k++) {
                    try {
                        result = result + Integer.parseInt(arr[i][k]);
                        System.out.println("Сумма всех элементов массива равна " + result);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, k);
                    }
                }

            }
            return result;
        }
    }

