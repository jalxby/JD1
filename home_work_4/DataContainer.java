package home_work_4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    DataContainer(T[] data) {
        this.data = data;
    }

    int dataCheck() {
        int status = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                status = -1;
            } else if (data[i] == null) {
                status = i;
                break;
            }
        }
        return status;
    }

    public int add(T item) {
        int status = dataCheck();
        int result = 0;
        if (item != null) {
            if (status == -1) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                result = data.length - 1;
            } else {
                data[status] = item;
                result = status;
            }
        } else {
            result = -1;
        }
        return result;
    }

    public T get(int index) {
        if (index >= data.length) {
            return null;
        } else {
            return data[index];
        }
    }

    public T[] getItems() {
        return this.data;
    }

    int countNull() {
        int nullCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                nullCount++;
            }
        }
        return nullCount;
    }

    public boolean delete(int index) {

        if (index >= data.length) {
            return false;
        } else if (index == data.length - 1) {
            data = Arrays.copyOf(data, data.length - 1);
            System.out.println(Arrays.toString(data));
            return true;
        } else {
            data[index] = null;
            deleteNuls();
            data = Arrays.copyOf(data, data.length - countNull());
            return true;
        }
    }

    private T[] deleteNuls() {
        T temp;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == null) {
                temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }
        data = Arrays.copyOf(data, data.length - countNull());
        return data;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                data[i] = null;
                this.delete(i);
                return true;
            }
        }
        return false;
    }


    void sort(Comparator<T> comparator) {
        T temp;
        for (int i = 0; i < data.length - 1; i++) {
            if (comparator.compare(data[i], data[i + 1]) < 0) {
                temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }

    }


    @Override
    public String toString() {

        return "DataContainer{" +
                "data=" + Arrays.toString(this.deleteNuls()) +
                '}';
    }
}


