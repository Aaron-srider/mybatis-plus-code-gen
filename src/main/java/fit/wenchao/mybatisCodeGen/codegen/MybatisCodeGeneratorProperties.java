package fit.wenchao.mybatisCodeGen.codegen;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("mybatis.codegen")
public class MybatisCodeGeneratorProperties {

    /**
     * 生成的所有代码都将放在该包（目录）下
     */
    private String parent_pck;

    /**
     * 项目作者
     */
    private String author;

    /**
     * 数据库路径
     */
    private String db_url;

    /**
     * 模块路径，必须以File.separator开头；如果不配置，则默认在当前主模块中生成
     */
    private String module_loc = "";

    /**
     * 数据库用户名
     */
    private String db_username;

    /**
     * 数据库密码
     */
    private String db_password;

    /**
     * 模板父路径
     */
    private String template_path = "/codeGenTemplates";

    /**
     * 是否自动生成controller（默认不自动生成）
     */
    private Boolean controller_on = false;

    /**
     * 该组件是否生效
     */
    private Boolean enabled = true;
}