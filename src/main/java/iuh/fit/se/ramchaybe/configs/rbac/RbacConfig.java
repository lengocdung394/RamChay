package iuh.fit.se.ramchaybe.configs.rbac;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class RbacConfig {
    private List<String> permissions;
    private Map<String, List<String>> roles;
}