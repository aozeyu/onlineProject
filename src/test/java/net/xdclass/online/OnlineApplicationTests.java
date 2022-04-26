package net.xdclass.online;

import io.jsonwebtoken.Claims;
import net.xdclass.online.model.entity.User;
import net.xdclass.online.utils.JWTUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineApplicationTests {

    @Test
    public void testGeneJwt() {
        User user = new User();
        user.setId(66);
        user.setName("二当家小D");
        user.setHeadImg("png");
        String token = JWTUtils.geneJsonWebToken(user);
        System.out.println(token);
        try {
            Thread.sleep(4000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Claims claims = JWTUtils.checkJWT(token);
        System.out.println(claims.get("name"));
    }

}
