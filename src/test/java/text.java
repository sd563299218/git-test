import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

public class text {
    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void tesxt(){
        List<Account> all = accountMapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

}
