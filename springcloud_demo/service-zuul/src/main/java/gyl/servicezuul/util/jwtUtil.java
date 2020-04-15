package gyl.servicezuul.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class jwtUtil {
    //公用密钥-保存到服务器端
    public static String SECRET="bosssoft";
    public static Map<String, Claim> verifyToken(String token){
        DecodedJWT jwt=null;
        try{
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            jwt=verifier.verify(token);
        }catch (Exception e){
            throw new RuntimeException("凭证已过期,请重新登录");
        }
        return  jwt.getClaims();

    }

}
