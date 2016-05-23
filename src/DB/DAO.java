package DB;

import java.util.List;

/**
 * Created by MBCNEWMAIN on 23.05.2016.
 */
public interface DAO<T> {
    boolean create(T product);

    List<T> findAll();

    T findById(int id);

    void update(T product);

    void delete(T product);
}
