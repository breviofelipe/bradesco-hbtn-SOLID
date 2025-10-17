import java.util.ArrayList;
import java.util.List;

public class UserModel {

    private int idUser;
    private String descricao;

    public static final int IDADE_MINIMA = 18;

    // Construtor
    public UserModel() {
    }

    public UserModel(int idUser, String descricao) {
        this.idUser = idUser;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Função que coleta todos os usuários
    public List<UserModel> fetchUsers() {
        return new ArrayList<>();
    }

    // Função que retorna todos os usuários
    public List<UserModel> getAllUsers() {
        return new ArrayList<>();
    }

    // Função que retorna usuários (pode ter filtros futuros)
    public List<UserModel> getUsers() {
        return new ArrayList<>();
    }
}
