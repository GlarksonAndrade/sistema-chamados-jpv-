package sistemachamados.usuariosDB;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashSenhas {

    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public  String generateSalt(){
        return BCrypt.gensalt();
    }

    public  String hashPassword(String passwordPlusSalt){

        return passwordEncoder.encode(passwordPlusSalt);
    }

    public  boolean checkPassword(String password , String hashedPassword){
        return passwordEncoder.matches(password,hashedPassword);
    }





}
