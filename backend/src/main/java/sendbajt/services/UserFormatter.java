package sendbajt.services;

import sendbajt.domain.User;
import sendbajt.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class UserFormatter implements Formatter<User> {

    @Autowired
    UserRepository repository;

    @Override
    public User parse(String idAsStr, Locale locale) throws ParseException {
        Integer id = Integer.parseInt(idAsStr);
        return repository.getUser(id);
    }

    @Override
    public String print(User object, Locale locale) {
        return object.toString();
    }
}
