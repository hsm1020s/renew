package com.example.renew.mapper;

import com.example.renew.domain.CustDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest // 스프링 컨텍스트와 함께 테스트를 실행합니다. 필요에 따라 @MybatisTest로 변경 가능
@AutoConfigureTestDatabase(replace = Replace.NONE) // 실제 데이터베이스 사용 설정
@Rollback(value = true) // 테스트 후 데이터 롤백
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testFindAll() {
        List<CustDto> customers = customerMapper.findAll();
        assertThat(customers).isNotNull();
        assertThat(customers.size()).isGreaterThan(0); // 데이터가 있다고 가정할 때
        // 추가적인 검증 로직 구현
    }
}
