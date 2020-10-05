package com.company;

public class iDNumber {
    private int size;
    private Student[] st;

    public iDNumber(int n){
        this.st=new Student[n];
    }
    public void Sort(){
        for (int left = 0; left < st.length; left++) {
            // Вытаскиваем значение элемента
            Student value = st[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getID() < st[i].getID()) {
                    st[i + 1] = st[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            st[i + 1] = value;
        }
    }
    public void add(Student student){
        st[size]=student;
        size++;
    }
    public Student get(int i){
        return st[i];
    }
}
