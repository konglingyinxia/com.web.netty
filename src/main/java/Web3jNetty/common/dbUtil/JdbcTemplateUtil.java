package Web3jNetty.common.dbUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 数据库配置
 *
 * @author 卫星
 * @package Web3jNetty.common.core
 * @date 2018-11-07  19:27
 * @project com.web.netty
 */
public class JdbcTemplateUtil {

    private ApplicationContext context;
    private DataSource dataSource;
    public static JdbcTemplate jdbcTemplate;

    public JdbcTemplateUtil() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dataSource = (DataSource) context.getBean(DataSource.class);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
