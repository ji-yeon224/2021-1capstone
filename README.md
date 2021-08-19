# 텍스트 마이닝 기반 가구 온라인 고객 리뷰 분석 및 추천 웹 사이트 
### :point_right: 프로젝트 목표
  - 회원가입과 로그인 기능을 구현한 ‘뒤집어집’을 통해 구매한 상품에
  대해서 자체적으로 리뷰 입력이 가능한 웹 플랫폼을 구현한다.
  - 가구 인테리어에 관심이 많은 사람이 정보를 공유하고 소통할 수 있는 커뮤니티 기능을 포함한다

### :point_right: 개발 환경
  - Java, spring boot
  - Intellij
  
### :point_right: 프로젝트 구조
![image](https://user-images.githubusercontent.com/69784492/130011433-6dd0a601-593f-4521-907b-ab52d7984def.png)
  - 상품 카테고리에서 상품을 볼 수 있고 검색이 가능하다. 각 상품 상세페이지로 들어가면 자연어 처리를 통해 얻은 상품 키워드를 확인할 수 있다. 
  - 키워드를 바탕으로 상품의 특성을 파악할 수 있으며 소비자들의 리뷰를 한눈에 볼 수 있고 리뷰 검색 필터도 가능하다. 
  - 또한, 추천시스템을 통해 상품을 추천을 받을 수 있다. flask 서버와 연결된 아이템 기반 추천 코드는 Spring Boot 내에서 요청 시 응답을 한다.
  - Spring Security 를 통해 사이트의 보안을 강화한다. 회원가입 시에 비밀번호는 bcryptencoder 를 이용하여 보안 수준을 높인다. 그리고 jwt token 을 이용해서 로그인에 대한 응답을 하고 사이트에 대한 권한을
부여함으로써 더 안전하게 데이터를 주고받는다. UserDetails 인터페이스를 이용하여 ‘뒤집어집’에 가입한 사용자들만 개인화 된 기능이 가능하다.
  
### :point_right: 프로젝트 결과
  - 메인화면
  ![캡처](https://user-images.githubusercontent.com/69784492/130011612-22e1f27d-c8b1-4b05-82cf-52db9fd75fa1.JPG)
  
  - 로그인 후 메인화면
  ![캡처](https://user-images.githubusercontent.com/69784492/130011741-fffe7d5f-2cc8-4897-ade6-08d03fce2fe1.JPG)
  
  - 카테고리 상품 목록
  ![캡처](https://user-images.githubusercontent.com/69784492/130011812-909a916e-a895-46c2-a31f-4db347e8d09c.JPG)
  
  - 상품 상세 페이지
  ![캡처](https://user-images.githubusercontent.com/69784492/130011997-1963b82a-d039-488a-9532-4ed760111689.JPG)
  
  - QnA 커뮤니티
  ![캡처](https://user-images.githubusercontent.com/69784492/130012293-f9c106e3-a7b7-48e9-833d-49b751816e28.JPG)
  
  - Photo 커뮤니티
  ![캡처](https://user-images.githubusercontent.com/69784492/130012410-01837a02-2660-4e05-8c05-742d754ec91d.JPG)
  
  - Photo 커뮤니티 글 상세 페이지
  ![캡처](https://user-images.githubusercontent.com/69784492/130012452-1783c993-4d96-497e-955a-d714dba35b96.JPG)
  
  
  
  
  
  
  
