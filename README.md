# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `Get /login`
- 로그아웃 `Get /logout`
- 회원가입 `Post /signIn`

### 내 정보

- 내 정보 `Get /myPage`
- 내 정보 수정 `Post /myPage`

### 상품

- 상품 목록 `Get /products`
- 상품 상세 `Get /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `Post /products/{id}/reviews`
- 상품에 리뷰 수정 `Patch /products/{id}/reviews/{id}`
- 상품에 리뷰 삭제 `Delete /products/{id}/reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `Post /cart`
- 장바구니에 상품 삭제 `Delete /cart/{id}`
- 장바구니 (담긴 상품 목록) `Get /cart`

### 주문하기

- 주문하기 `Post /orders`
- 주문 목록 `Get /orders`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?<br/>
    : 동일한 URL을 사용해야 클라이언트와 서버를 작업할 때 혼동이 생기지 않을 것 같다.
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?<br/>
    : HTTP 요청을 할 때 서버로부터 받은 토큰을 넣어서 통신하면 서버에서 사용자를 식별할 수 있다.
> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?<br/>
    : 토큰의 유효시간을 반영하여 일정 시간이 지나면 갱신되도록 처리해야 할 것 같다.
