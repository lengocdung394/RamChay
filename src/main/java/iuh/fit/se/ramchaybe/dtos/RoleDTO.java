package iuh.fit.se.ramchaybe.dtos;

public class RoleDTO {
    private  int roleId;
    private String name;
    private String description;

    public RoleDTO(int roleId, String name, String description) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
    }
}
