
import br.com.facdombosco.progc.app.acessos.GUILogin;
import br.com.facdombosco.progc.dao.baseclasses.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        //Para inicializar o Hibernate
        HibernateUtil.getSessionFactory();
        GUILogin guilogin = new GUILogin();
    }

}
