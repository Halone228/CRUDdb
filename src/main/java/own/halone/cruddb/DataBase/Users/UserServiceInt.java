package own.halone.cruddb.DataBase.Users;

import java.util.Collection;
import java.util.Optional;

public interface UserServiceInt {
    Collection<User> getAll();
    void save(User target);
    void delete(User target);
    Optional<User> getById(long id);
}
