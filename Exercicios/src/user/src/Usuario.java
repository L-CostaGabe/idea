public class Usuario {

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean admin;

    public Usuario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void realizarLogin() {
        System.out.println("Login realizado com sucesso para o usuário: " + nome);
    }

    public void realizarLogout() {
        System.out.println("Logout realizado com sucesso para o usuário: " + nome);
    }

    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados do usuário " + nome + " alterados com sucesso.");
    }
    public void alterSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha do usuário " + nome + " alterada com sucesso.");
    }
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Admin: " + (admin ? "Sim" : "Não"));
    }
}
