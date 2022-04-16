package own.halone.cruddb.DataBase.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceInt{
    @Autowired private UserRepository userRepository;
    @Override
    public Collection<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User target) {
        userRepository.save(target);
    }

    @Override
    public void delete(User target) {
        userRepository.delete(target);
    }

    @Override
    public Optional<User> getById(long id) {
        return userRepository.findById(id);
    }
}
