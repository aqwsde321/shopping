package org.art.gallery.backend.service;


import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtServiceImpl implements JwtService {

    private String secretKey = "asiudhaiusdhaiuwh2aiuhwiudwaudniusrvniwrunvikwuh";

    @Override
    public String getToken(String key, Object value) {
        Date expTime = new Date();
        expTime.setTime(expTime.getTime() + (1000 * 60 * 5));

        //byte[] secretKeyBytes = DatatypeConverter.parseBase64Binary(singKey);
        byte[] secretKeyBytes = Base64.getDecoder().decode(secretKey);
        Key singKey = new SecretKeySpec(secretKeyBytes, SignatureAlgorithm.HS256.getJcaName());

        Map<String, Object> headerMap = new HashMap<String, Object>();
        headerMap.put("typ", "JWT");
        headerMap.put("alg", "HS256");

        Map<String, Object> map = new HashMap<>();
        map.put(key, value);

        JwtBuilder builder = Jwts.builder()
                .setHeader(headerMap)
                .setClaims(map)
                .setExpiration(expTime)
                .signWith(singKey, SignatureAlgorithm.HS256);

        return builder.compact();
    }

    @Override
    public Claims getClaims(String token) {
        if(token != null && !"".equals(token)) {
            try{
                byte[] secretKeyBytes = Base64.getDecoder().decode(secretKey);
                Key signKey = new SecretKeySpec(secretKeyBytes, SignatureAlgorithm.HS256.getJcaName());
                return Jwts.parserBuilder().setSigningKey(signKey).build().parseClaimsJws(token).getBody();
            }catch (ExpiredJwtException e) {
                // 만료됨
            }catch (JwtException e) {
                // 유효하지 않음
            }
        }

        return null;

    }
}
