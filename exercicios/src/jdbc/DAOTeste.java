package jdbc;

public class DAOTeste {

    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Ana Julia", 20));
        System.out.println(dao.incluir(sql, "Ana Carla", 21));
        System.out.println(dao.incluir(sql, "Ana Rosa", 22));

        dao.close();
    }

}
