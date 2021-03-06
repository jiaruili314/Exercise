//Set 方法

public interface Set<E> extends Collection<E> {

    A:添加功能
    boolean add(E e);
    boolean addAll(Collection<? extends E> c);

    B:删除功能
    boolean remove(Object o);
    boolean removeAll(Collection<?> c);
    void clear();

    C:长度功能
    int size();

    D:判断功能
    boolean isEmpty();
    boolean contains(Object o);
    boolean containsAll(Collection<?> c);
    boolean retainAll(Collection<?> c); 

    E:获取Set集合的迭代器：
    Iterator<E> iterator();

    F:把集合转换成数组
    Object[] toArray();
    <T> T[] toArray(T[] a);
    
    //判断元素是否重复，为子类提高重写方法
    boolean equals(Object o);
    int hashCode();