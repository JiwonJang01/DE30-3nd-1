# 편지가 도착했습니다

![image](https://github.com/pladata-encore/DE30-3nd-1/assets/161932948/f44cf47d-0dd7-40e0-a888-ad5ee832f690)


## 툴

### 백엔드

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=whitee" />  

<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />  

<img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white" />  

### 프론트
<img src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white" /> 

<img src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white" /> 
 
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white" />  

### DB
<img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white" />  


### 작업툴
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" />  

## 목차

[프로젝트 개요](https://github.com/pladata-encore/DE30-3nd-1/tree/main?tab=readme-ov-file#%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EA%B0%9C%EC%9A%94)

[백엔드](https://github.com/pladata-encore/DE30-3nd-1/tree/main?tab=readme-ov-file#%EB%B0%B1%EC%97%94%EB%93%9C-1)

[프론트](https://github.com/pladata-encore/DE30-3nd-1/tree/main?tab=readme-ov-file#%ED%94%84%EB%A1%A0%ED%8A%B8-1)

[배포](https://github.com/pladata-encore/DE30-3nd-1/tree/main?tab=readme-ov-file#%EB%B0%B0%ED%8F%AC)

##  Members 
- 윤소영 
- 정제윤 
- 곽태호 
- 장지원
- 최은서

# 프로젝트 개요


## 🏣 프로젝트 소개
이번 프로젝트에서는 사용자가 받고 싶은 편지 유형을 선택하면 다른 사용자가 편지를 작성하여 보낼 수 있는 웹서비스를 구현했습니다.
받고 싶은 편지 유형과 구체적인 내용을 입력하면 사이트 사용자 누구나 편지를 보낼 수 있습니다



### 서비스 시연
![](https://velog.velcdn.com/images/devysy55/post/025a9adb-86cb-4501-95e4-6bc474fecd7c/image.gif)



## 💻 프로젝트 구조

추가예정

## ⭐ 프로젝트 목표
- 스프링부트 활용 능력 향상
- api 개발, DB 설계 등 백엔드 능력 향상
- 프론트 웹페이지 제작


## 📖 프로젝트 기획
### 피그마를 활용한 기획서 작성(화면설계서, 와이어프레임)
![](https://velog.velcdn.com/images/devysy55/post/4d0fe97b-f954-46bc-a859-e11c63cd3a51/image.png)

- [figma 바로가기 링크](https://www.figma.com/design/DH4LJTcuM0VVW1bMyVEYxG/3%EC%B0%A8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8?node-id=0-1&t=YUL0zFJ7tUl3oPJV-1)
- description까지 작성한 화면설계서 작성하여 협업
<img src='https://velog.velcdn.com/images/devysy55/post/07f4d997-c9c8-4486-bf9c-534d3adabf98/image.png' width=800px></img>


<br>
<br>

### 구글 공유문서를 활용한 DB, API 협업용 문서 작성

![](https://velog.velcdn.com/images/devysy55/post/99bcae97-0212-4f51-9f53-6df85adb6ff6/image.png)

- 기획 단계 이후 DB, api 개발을 위해   DB 설계서, API 명세서



# 백엔드

<br>

## 백엔드 여러분 여기다 넣어줘요


## 로그인 및 회원가입
####곽태호
- 로그인 및 회원가입 화면
- 편지 상세 내용


### 로그인/회원가입: spring security 사용

### spring security
- Spring 기반 애플리케이션의 보안을 담당하는 프레임 워크
- 인증과 권한에 대해 Filter 흐름에 따라 처리하고 있으며 보안과 관련해서 많은 옵션을 제공해주고 있기 때문에 개발자가 일일이 보안 로직을 작성하지 않아도 된다는 장점이 있다.

### spring security 인증 처리 과정
![](https://velog.velcdn.com/images/taehokk/post/0006457b-24df-412c-875e-49980de8bb1d/image.png)
1 사용자가 폼에 아이디, 패스워드를 입력하면 HTTPServletRequest에 아이디, 비밀번호 정보가 전달. 이때 AuthenticationFilter가 넘어온 아이디와 비밀번호의 유효성 검사를 실시한다.

2 유효성 검사 후 실제 구현체인 UsernamePasswordAuthenticationToken을 만들어 넘겨준다.

3 인증용 객체인 UsernamePasswordAuthenticationToken을 AuthenticationManager에게 전달한다.

4 UsernamePasswordAuthenticationToken을 AuthenticationProvider에게 전달한다.

5 사용자 아이디를 UserDetailsService로 보냅니다. UserDetailService는 사용자 아이디로 찾은 사용자의 정보를 UserDetails 객체로 만들어 AuthenticationProvider에게 전달한다.

6 DB에 있는 사용자 정보를 가져온다.

7 입력 정보와 UserDetails의 정보를 비교해 실제 인증 처리를 진행한다.

8~ 10까지 인증이 완료되면 SecurityContextHolder에 Authentication을 저장한다.
인증 성공 여부에 따라 성공 시 AuthenticationSuccessHandler, 실패 시 AuthenticationFailureHandler 핸들러를 실행한다.

[출처](https://velog.io/@dh1010a/Spring-Spring-Security%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EA%B5%AC%ED%98%84-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-3.X-%EB%B2%84%EC%A0%84-1)




### 구성
Authentication
- 인증은 사용자의 신원을 확인하는 과정으로, 사용자가 제공한 자격 증명(예: 아이디와 비밀번호)을 검증하여 사용자를 식별한다. 
- Spring Security는 다양한 인증 방식을 지원하며, 사용자 정보를 데이터베이스, LDAP 서버, 메모리 등 다양한 소스에서 가져올 수 있다.

Authorization
- 인가는 인증된 사용자에게 특정 리소스 또는 기능에 대한 액세스 권한을 부여하는 과정이다. 
- Spring Security는 세분화된 권한 관리를 지원하여, 역할 기반의 접근 제어를 구현할 수 있다. 
- 이를 통해 애플리케이션의 리소스에 대한 접근 제한을 설정할 수 있다.




### 순환 참조 문제 발생

#### 순환 참조
- 순환 참조는 두 개 이상의 빈이 서로를 의존하는 상황을 말한다.
- 예를 들어, 클래스 A가 클래스 B를 의존하고, 클래스 B가 다시 클래스 A를 의존할 때 순환 참조가 발생한다. 이런 경우, Spring 컨테이너는 어느 빈을 먼저 생성해야 할지 결정하지 못해 순환 참조 예외를 발생한다.


#### 해결
- 기본적으로 Spring Boot 2.6 이상에서는 순환 참조가 허용되지 않는게 default값이다.
- 이를 spring.main.allow-circular-references=true 설정하여 순환 참조를 허용한다.
- 하지만 이는 일시적인 해결법으로 나중에 근본적으로 해결하기 위해 설계 구성을 변경해야한다.


---

## 편지 상세 내용

#### controller 코드
```
@GetMapping("/letterDetails/{id}")
public String getLetterContentById(@PathVariable("id") Long id, Model model) {
    Letter letter = letterService.findLetterById(id);
    if (letter == null) {
        return "error"; 
    model.addAttribute("letter", letter);
    return "letterContent";
}
```

- letterService.findLetterById(id): id에 해당하는 편지를 데이터베이스에서 조회한다

- model.addAttribute("letter", letter): letter 객체를 모델에 추가하여 뷰에서 접근할 수 있도록 한다

- /letterDetails/{id}의 id는 편지의 식별자

- 편지를 찾지 못한 경우 error 페이지로 이동


#### service 코드
```
    public String getLetterContentById(Long id) {
        Letter letter = letterRepository.findById(id).orElse(null);
        if (letter == null) {
            return null; 
        }
        return letter.getContent();
    }
```


- letterRepository.findById(id): id에 해당하는 편지를 데이터베이스에서 조회한다.
- .orElse(null): Optional 객체에 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 null을 반환한다.


#### repository 코드
```
public interface LetterRepository extends JpaRepository<Letter, Long> {
    List<Letter> findByRecipient(String recipient);

    @Query("SELECT l FROM Letter l JOIN l.letterType lt WHERE lt.user.idx_user = :userId")
    List<Letter> findLettersByUserId(@Param("userId") Long userId);
}
```

- extends JpaRepository: JpaRepository를 확장하여 기본적인 CRUD 기능을 상속받으며, 추가로 사용자 정의 쿼리를 정의할 수 있다.

- JPQL(Java Persistence Query Language)을 사용하여 커스텀 쿼리를 정의한다.
- @Query: Letter 엔티티와 연관된 letterType 엔티티를 조인하고, userId가 일치하는 Letter 목록을 검색gksek.
- @Param 어노테이션: userId를 쿼리 매개변수로 사용한다.


#### JPQL
특징
- jpa에서 sql을 추상화한 JPQL이라는 객체 지향 쿼리 언어를 제공한다.
- sql처럼테이블을 대상으로 쿼리 하는 것이 아닌 엔티티 객체를 대상으로 쿼리한다.
- sql 문법과 매우 유사하다.

문제점
- JPQL은 기본 문자열로 작성되기 때문에 컴파일 시 에러를 발생하지 않는다.
- 때문에 문제가 있음에도 불구하고 정상적으로 작동하여 배포 시 문제가 발생할 수 있다.
- 동적으로 쿼리 언어를 작성하는 데 효율적이지 못하다.

<br>
<br>

## 편지작성

최은서
- 편지 작성 페이지


### Letter 엔터티 설정

[코드]

```
package com.example.letterapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Letter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String sender;
    private String recipient;

    @ManyToOne
    private LetterType letterType;

    }
    
 ```
<Letter-받는 편지>		

전송되는 (답장)편지들에 해당됩니다. 작성 즉시 저장되고, 누적됩니다. 
![](https://velog.velcdn.com/images/eschoi2402/post/ea43e24c-7122-4ae0-bc99-d0093ad623b5/image.png)

Entity: 이 클래스가 JPA 엔티티임을 나타냅니다. 데이터베이스 테이블에 매핑됩니다.

@Getter와 @Setter: Lombok 라이브러리를 사용하여 자동으로 getter와 setter 메서드를 생성합니다.

@Id: 필드가 엔티티의 기본 키(primary key)임을 나타냅니다.
@GeneratedValue(strategy = GenerationType.IDENTITY): 기본 키 생성을 데이터베이스에 위임합니다. 

private Long id; : 편지의 고유 식별자(Primary Key)
private String title; : 편지의 제목
private String content; : 편지의 내용
private String sender; : 발신자
private String recipient; : 수신자

LetterType 엔터티와 다대일 관계를 설정했습니다. 즉, 여러 편지가 하나의 LetterType을 가질 수 있습니다.

![](https://velog.velcdn.com/images/eschoi2402/post/59adb76f-3fb8-407c-9e41-8b8488eec4fd/image.png)





### LetterController

1. 편지 정보 조회 메서드

```
@Operation(summary = "Show letter info by ID")
@GetMapping("/letterinfo")
public String showLetterInfo(@RequestParam Long letterIdx, Model model) {
    Letter letter = letterService.findLetterById(letterIdx);
    model.addAttribute("letter", letter);
    return "letterinfo";
}
```

@Operation: 이 메서드의 Swagger 문서화 정보를 제공하며 요약 정보를 지정합니다.
@GetMapping("/letterinfo"): /letterinfo 경로로 GET 요청이 들어올 때 이 메서드를 실행합니다.
@RequestParam Long letterIdx: 요청 매개변수로 letterIdx를 받습니다.
Model: 뷰로 데이터를 전달하기 위해 사용됩니다.
편지 정보를 조회하여 letterinfo 뷰에 전달합니다.

2. 새 편지 보내기 메서드

```
@Operation(summary = "Send a new letter")
@PostMapping("/send")
public String sendLetter(
        @RequestParam(name = "title") String title,
        @RequestParam(name = "content") String content,
        @RequestParam(name = "sender") String sender,
        @RequestParam(name = "recipient") String recipient,
        @RequestParam(name = "letterTypeId") Long letterTypeId,
        Model model) {
    Letter letter = new Letter();
    letter.setTitle(title);
    letter.setContent(content);
    letter.setSender(sender);
    letter.setRecipient(recipient);
    letter.setLetterType(letterTypeService.findLetterTypeById(letterTypeId));
    letterService.saveLetter(letter);
    model.addAttribute("status", "편지가 성공적으로 전송되었습니다");
    return "redirect:/";
}
```
@PostMapping("/send"): /send 경로로 POST 요청이 들어올 때 이 메서드를 실행합니다.
편지 정보를 받아 새로운 편지를 생성하고 저장한 후, 홈 페이지로 리다이렉트합니다.



3. 사용자 편지 목록 조회 메서드

```
@Operation(summary = "Show letters page for the authenticated user")
@GetMapping("/letters")
public String showLettersPage(@AuthenticationPrincipal UserDetails userDetails, Model model) {
    if (userDetails != null) {
        User user = userService.findByNickname(userDetails.getUsername());
        if (user != null) {
            List<Letter> letters = letterService.findLettersByUserId(user.getIdx_user());
            model.addAttribute("letters", letters);
        }
    }
    return "letters";
}
```


@AuthenticationPrincipal UserDetails userDetails: 현재 인증된 사용자 정보를 가져옵니다.
사용자의 편지 목록을 조회하여 letters 뷰에 전달합니다.


4. 편지 내용 조회 메서드

```
@Operation(summary = "Show letter content by ID")
@GetMapping("/letters/{id}")
public String showLetterPage(@PathVariable Long id, Model model) {
    Letter letter = letterService.findLetterById(id);
    if (letter == null) {
        return "error"; // 편지를 찾지 못한 경우 에러 페이지로 이동
    }
    model.addAttribute("letter", letter);
    return "letterContent";
}
```

@GetMapping("/letters/{id}"): /letters/{id} 경로로 GET 요청이 들어올 때 이 메서드를 실행합니다. {id}는 경로 변수입니다.
특정 ID의 편지를 조회하여 letterContent 뷰에 전달합니다.


5. 인덱스 페이지 표시 메서드

```
@Operation(summary = "Show index page")
@GetMapping("/index")
public String showIndexPage(Model model, @AuthenticationPrincipal UserDetails userDetails) {
    if (userDetails != null) {
        User user = userService.findByNickname(userDetails.getUsername());
        if (user != null) {
            List<Letter> letters = letterService.findLettersByRecipient(user.getNickname());
            model.addAttribute("letters", letters);
        }
    }
    long totalLetters = letterService.countLetters(); // 전체 편지 수 계산
    model.addAttribute("totalLetters", totalLetters); // 모델에 추가
    return "index"; // 인덱스 페이지로 이동
}
```

@GetMapping("/index"): /index 경로로 GET 요청이 들어올 때 이 메서드를 실행합니다.
인증된 사용자의 편지 목록과 전체 편지 수를 조회하여 index 뷰에 전달합니다.


### LetterService


1. 편지 저장 메서드
```
public void saveLetter(Letter letter) {
    letterRepository.save(letter);
}
```
편지 객체를 받아 letterRepository를 사용하여 데이터베이스에 저장합니다.

2. 모든 편지 조회 메서드
```
public List<Letter> findAllLetters() {
    return letterRepository.findAll();
}
```
데이터베이스에서 모든 편지를 조회하여 리스트로 반환합니다.

3. ID로 편지 조회 메서드
```
public Letter findLetterById(Long id) {
    return letterRepository.findById(id).orElse(null);
}
```
주어진 ID로 편지를 조회합니다. 해당 ID의 편지가 없으면 null을 반환합니다.

4. 수신자 이름으로 편지 조회 메서드
```
public List<Letter> findLettersByRecipient(String recipient) {
    return letterRepository.findByRecipient(recipient);
}
```
주어진 수신자 이름으로 편지를 조회하여 리스트로 반환합니다.

5. 사용자 ID로 편지 조회 메서드
```
public List<Letter> findLettersByUserId(Long userId) {
    return letterRepository.findLettersByUserId(userId);
}
```
주어진 사용자 ID로 편지를 조회하여 리스트로 반환합니다.

6. 모든 편지 유형 조회 메서드
```
public List<LetterType> findAllLetterTypes() {
    return letterTypeRepository.findAll();
}
```
데이터베이스에서 모든 편지 유형을 조회하여 리스트로 반환합니다.

7. 편지 리스트 조회 메서드
```
public List<Letter> getLettersWithComments() {
    return letterRepository.findAll();
}
```
모든 편지 목록을 조회합니다.

8. 편지 내용 조회 메서드
```
public String getLetterContentById(Long id) {
    Letter letter = letterRepository.findById(id).orElse(null);
    if (letter == null) {
        return null; // 해당 ID의 편지가 없을 경우
    }
    return letter.getContent(); // 편지의 내용 반환
}
```
주어진 ID의 편지 내용을 조회하여 반환합니다. 해당 ID의 편지가 없으면 null을 반환합니다.

9. 
전체 편지 수 계산 메서드
```
public long countLetters() {
    return letterRepository.count();
}
```
데이터베이스에 저장된 전체 편지의 수를 계산하여 반환합니다. (총 발송된 편지의 개수 홈 화면에서 파악하기 위함)


### LetterRepository

1. 수신자 이름으로 편지 조회

```
List<Letter> findByRecipient(String recipient);
```
수신자 이름(recipient)으로 편지 목록을 조회합니다.

2. 사용자 ID로 편지 조회
```
@Query("SELECT l FROM Letter l JOIN l.letterType lt WHERE lt.user.idx_user = :userId")
List<Letter> findLettersByUserId(@Param("userId") Long userId);
```
@Query 어노테이션을 사용하여 사용자 정의 JPQL(Java Persistence Query Language) 쿼리를 작성합니다.
Letter 엔터티와 LetterType 엔터티를 조인하여 특정 사용자 ID(userId)와 관련된 편지 목록을 조회합니다.
@Param("userId")는 쿼리에서 사용하는 파라미터를 바인딩합니다.


3. 전체 편지 수 계산
```
long count();
```
데이터베이스에 저장된 전체 편지의 수를 계산하여 반환합니다. 


<br>
<br>

## 요청 편지

#### 장지원
- 요청 편지 설정 페이지

### 홈화면에 전체 편지 건수 카운트 - get
Letter 테이블을 전체의 행 수를 가져오는 api입니다.
로그인 전후 화면 상단에서 '지금까지 N건의 편지를 전달했어요' 부분에서 확인할 수 있습니다.

```JAVA
@GetMapping("/count")
    public Map<String, Long> getLetterCount() {
        long count = letterCountService.countLetters();
        Map<String, Long> response = new HashMap<>();
        response.put("count", count);
        return response;
    }
```
![](https://velog.velcdn.com/images/jiw0707/post/acca43a3-e681-4cee-a349-e27bdb482ec6/image.png)

## 받고 싶은 편지 설정(LetterType)

### LetterType 테이블
LetterType 테이블을 사용자가 요청한 편지의 정보를 저장하는 테이블입니다. idx_user컬럼을 통해서 user테이블과 매핑하여 사용자 별로 다른 데이터를 가질 수 있게 하였습니다.
해당 테이블은 정보를 저장할 때마다 갱신되는 테이블입니다. 따라서 새로운 요청 편지가 저장되면 이전의 요청 편지는 사라집니다.
![](https://velog.velcdn.com/images/jiw0707/post/a92337a4-3221-48d6-9c38-f37efeb326b0/image.png)

### 요청 편지 리스트
'받고 싶은 편지 선택하기'에서 저장한 편지들의 리스트를 만들기위해 전체 LetterType 테이블의 정보를 가져옵니다. 해당 리스트는 로그인 전후 화면에서 확인할 수 있습니다.
```JAVA
@GetMapping("/want")
    public List<Map<String, Object>> getAllLetterTypesWithUserDetails() {
        return letterTypeService.getAllLetterTypesWithUserDetails();
    }
```
![](https://velog.velcdn.com/images/jiw0707/post/65b57732-fe5c-4f21-a9ee-8a3f997f5334/image.png)

### 사용자의 이메일 전송 여부, 랜덤여부 확인
user테이블에서 이메일 전송 여부와 이메일 주소, 랜덤 편지 수신여부에 대한 정보를 가져옵니다.
```JAVA
@GetMapping("/user/{idx_user}/select")
    public User getUserSelect(@PathVariable("idx_user") Long idx_user) {
        return userService.getUserById(idx_user);
    }
```
![](https://velog.velcdn.com/images/jiw0707/post/871eae78-87f8-4cbf-9875-c0f8275b9545/image.png)



### 사용자의 편지 유형 선택 정보
사용자가 선택한 편지 유형과 저장된 코멘트를 가져옵니다. 이 정보는 사용자 별로 다른 정보를 가진 화면을 보여주어야 하기 때문에 user테이블의 정보도 필요합니다.
```JAVA
@GetMapping("/user/{idx_user}/lettertype")
    public List<LetterType> getLetterTypesForUser
            (@PathVariable("idx_user") Long idx_user) {
        return letterTypeService.getLetterTypesForUser(idx_user);
    }
```
![](https://velog.velcdn.com/images/jiw0707/post/77da2c5d-be8e-4d7a-bf04-696e1e23b776/image.png)



### 받고 싶은 편지 선택하기 정보 변경
입력 화면에서 내용을 변경한 후 저장하기 버튼을 클릭하면 유저의 이메일 수신 여부, 이메일 주소, 랜덤 편지 수신 여부와 편지 유형 선호도를 업데이트 합니다.
```JAVA
@PatchMapping("/change/{letterTypeId}")
    public ResponseEntity<LetterType> updateLetterType(@PathVariable("letterTypeId") Long letterTypeId, @RequestBody LetterTypeDto letterTypeDto) {
        try {
            // 주어진 letterTypeId로 LetterType 엔티티를 가져옴
            Optional<LetterType> optionalLetterType = letterTypeService.getLetterTypeById(letterTypeId);

            // letterTypeId에 해당하는 LetterType이 없는 경우
            if (!optionalLetterType.isPresent()) {
                return ResponseEntity.notFound().build(); // 404 Not Found
            }

            LetterType letterType = optionalLetterType.get();

            // User 엔티티도 업데이트
            User user = userService.getUserById(letterTypeDto.getUserIdx());
            if (user == null) {
                return ResponseEntity.badRequest().body(null); // User가 없을 경우 예외 처리
            }
            user.setEmail_sub(letterTypeDto.isEmailSub());
            user.setEmail(letterTypeDto.getEmail());
            user.setRandom_sub(letterTypeDto.isRandomSub());

            // User 엔티티 저장
            userService.saveUser(user);

            // LetterTypeDto에서 필요한 필드로 LetterType 엔티티를 업데이트
            if (letterTypeDto.getCategory() != null) {
                letterType.setCategory(letterTypeDto.getCategory());
            }
            if (letterTypeDto.getComment() != null) {
                letterType.setComment(letterTypeDto.getComment());
            }
            if (letterTypeDto.getDateRecieve() != null) {
                letterType.setDate_recieve(letterTypeDto.getDateRecieve());
            }

            // LetterType 엔티티 저장
            LetterType updatedLetterType = letterTypeService.saveLetterType(letterType);

            // 업데이트된 성공시 반환
            return ResponseEntity.ok(updatedLetterType); // 200 OK
        } catch (Exception e) { // 업데이트된 실패시 반환
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500 Internal Server Error
        }
    }
```
![](https://velog.velcdn.com/images/jiw0707/post/43f87f3e-6d20-4ba5-ad9a-c868f9a05e0e/image.png)

</br>
</br>

## Swagger 연동
#### 윤소영
- SpringDoc OpenAPI Starter WebMVC UI 사용하여 Swagger 연동

```
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0'
````

<img src='https://velog.velcdn.com/images/devysy55/post/e907c885-55f2-4fc8-9720-1c2f9b7bc3c3/image.png' width=600px></img>

## 프론트 작업 과정에서 api추가 작업
#### 윤소영
### @GetMapping("/api/user/idx")
- 받고 싶은 편지 선택하기 화면 제작 중 resquest 값에 로그인 한 회원의 idx 정보 필요한 이슈 발생
- UserController

```
 public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "로그인 유저 Idx 정보 가져옴")
    @GetMapping("/api/user/idx")
    public Long getLoggedInUserId(@AuthenticationPrincipal UserDetails userDetails) {
        if (userDetails != null) {
            User user = userService.findByNickname(userDetails.getUsername());
            if (user != null) {
                return user.getIdx_user(); // 로그인한 사용자의 Idx 반환
            }
        }
        return null; // 사용자가 로그인하지 않았거나 사용자를 찾을 수 없는 경우
    }
```
  
## @GetMapping("/letters")
- 받은 편지함 작업 중 회원별 받은 편지 조회 api 추가
- LetterController
```
  @Operation(summary = "로그인 회원의 받은 편지 조회")
    @GetMapping("/letters")
    public String showLettersPage(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        if (userDetails != null) {
            User user = userService.findByNickname(userDetails.getUsername());
            if (user != null) {
                List<Letter> letters = letterService.findLettersByUserId(user.getIdx_user());
                model.addAttribute("letters", letters);
            }
        }
        return "letters";
    }
```

- LetterService
```
public List<Letter> findLettersByUserId(Long userId) {
        return letterRepository.findLettersByUserId(userId);
    }
```

- LetterRepository
```
 @Query("SELECT l FROM Letter l JOIN l.letterType lt WHERE lt.user.idx_user = :userId")
    List<Letter> findLettersByUserId(@Param("userId") Long userId);
```

<br>
<br>
  
# 프론트
- HTML, CSS, JavaScript, 그리고 Thymeleaf 템플릿 엔진을 사용하여 구현

## 로그인 및 회원가입 화면 style 설정하기
### 정제윤

```
<style>
        table {
            width: 280px;
            height: 300px;
            margin: auto;
            font-size: 15px;
            border-collapse: collapse;
        }
        input[type="text"].nickname {
            width: 250px;
            height: 32px;
            font-size: 15px;
            border: 0;
            border-radius: 15px;
            outline: none;
            padding-left: 10px;
            background-color: rgb(233,233,233);
        }
</style>
```

1. 로그인 및 회원가입 화면의 전체 테이블 크기 지정 및 옵션 설정하기
2. 로그인 및 회원가입 화면에 표시될 항목별로 클래스 설정하여 적용할 디자인 및 옵션 설정하기

<br/>

```
<body>
<form th:action="@{/login}" method="post">
    <table>
        <tr>
            <td class="center-text"><h2>로그인</h2></td> <!-- 가운데 정렬 클래스 추가 -->
        </tr>
        <tr>
            <td>닉네임</td>
        </tr>
        <tr>
            <td><input type="text" class="nickname" placeholder=" 닉네임을 입력해주세요" th:name="username" required></td>
        </tr>
    </table>
</body>
```

1. style에 설정한 옵션 및 클래스 지정하여 로그인 회원가입 화면에 구현할 내용 body에 코드 작성하기
2. Thymeleaf 속성 적용할 부분 표기하기 ('th:', '@{/}')
<br/>

### CSS

```
.login {
    width: 280px;
    height: 300px;
    margin: auto;
    font-size: 15px;
    border-collapse: collapse;
    margin: auto;
}
input[type="text"].nickname, input[type="password"].password {
    width: 250px;
    height: 32px;
    font-size: 15px;
    border: 0;
    border-radius: 15px;
    outline: none;
    padding-left: 10px;
    background-color: rgb(233,233,233);
}
input.nickname::placeholder, input.password::placeholder {
    font-size: 12px;
}
```

1. CSS폴더를 생성하여 반복적으로 적용되는 디자인 패턴을 CSS 파일에 클래스별로 저장하기
2. 추가적으로 적용할 디자인 및 옵션을 클래스 형태로 CSS파일에 작성하기

<br/>

```
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" th:href="@{css/style.css}">
</head>
```

1. head에 CSS파일 경로 설정하기
2. Thymeleaf 속성 적용하여 CSS파일 연결하기
<br/>

```
<body>
<form th:action="@{/login}" method="post">
    <table class = "login">
        <tr>
            <td class="center-text"><h2>로그인</h2></td>
        </tr>
        <tr>
            <td>닉네임</td>
        </tr>
        <tr>
            <td><input type="text" class="nickname" placeholder=" 닉네임을 입력해주세요" th:name="username" required></td>
        </tr>
        <tr>
            <td>비밀번호</td>
        </tr>
        <tr>
            <td><input type="password" class="password" placeholder=" 비밀번호를 입력해주세요" th:name="password" required></td>
        </tr>
        <tr>
            <td><button type="submit" class="btn">로그인하기</button></td>
        </tr>
        <tr>
            <td class="join"><a th:href="@{/register}">회원가입</a></td>
        </tr>
    </table>
</form>
</body>
```

1. CSS에 작성한 테이블 적용하여 로그인 회원가입 화면에 구현할 내용 body에 코드 작성하기
<br/>




## 홈, 편지함, 받고싶은 편지 선택, 편지쓰기 화면 제작 및 api연동
### 윤소영
### 주요 작업 사항
- 부트스트랩, 커스텀css활용하여 디자인 적용
- JavaScript 사용하여 서버로부터 편지 희망 등 데이터를 동적으로 가져옴
- DOMContentLoaded 이벤트 리스너를 사용하여 페이지가 로드되면 세션 저장소에서 특정 데이터를 불러옴
- Ajax를 사용하여 비동기적으로 서버와 통신
  
###  스크립트 코드 일부
```
  document.addEventListener('DOMContentLoaded', function () {
        fetch('/api/lettertype/want')
            .then(response => response.json())
            .then(data => {
                // 데이터를 날짜별로 정렬합니다.
                data.sort((a, b) => {
                    return new Date(b.date_receive) - new Date(a.date_receive);
                });

                const letterWishList = document.getElementById('letter-wish-list');
                data.forEach(item => {
                    if (item.comment !== null && item.comment !== "null") {
                        const listItem = document.createElement('li');
                        listItem.className = 'list-group-item';
                        const categoryColor = getCategoryColor(item.category[0]);
                        listItem.innerHTML = `
                            <span style="font-size: 13px; color: ${categoryColor};">${getCategoryText(item.category[0])}</span>
                            <span style="font-size: 13px;">  ${item.nickname}</span><br>

                            ${item.comment}<br>
                            <span style="font-size: 13px;">${item.date_receive ? new Date(new Date(item.date_receive).getTime() + (9 * 60 * 60 * 1000)).toLocaleString('ko-KR', {
                                timeZone: 'Asia/Seoul',
                                year: 'numeric',
                                month: '2-digit',
                                day: '2-digit',
                                hour12: false,
                                hour: '2-digit',
                                minute: '2-digit'
                            }) : '날짜 정보 없음'}</span>
                        `;
                        listItem.addEventListener('click', function() {
                            if (!isAuthenticated()) {
                                window.location.href = '/login';
                            } else {
                                // 선택된 항목의 정보를 sessionStorage에 저장합니다.
                                sessionStorage.setItem('selectedLetter', JSON.stringify(item));
                                window.location.href = '/write';
                            }
                        });
                        letterWishList.appendChild(listItem);
                    }
                });
            });
    });

    function isAuthenticated() {
        return document.getElementById('isAuthenticated').value === 'true';
    }

    function getCategoryText(category) {
        switch(category) {
            case 1: return '재밌는 얘기해 주세요😄';
            case 2: return '위로 받고 싶어요😥';
            case 3: return '고민 있어요 조언해 주세요😯';
            case 4: return '아무말 대잔치🍟';
            default: return '기타';
        }
    }

    function getCategoryColor(category) {
        switch(category) {
            case 1: return 'blue';
            case 2: return 'green';
            case 3: return 'orange';
            case 4: return 'red';
            default: return 'black';
        }
    }
 ```
  
  
## 개선 예정
- 코드 구조 개선
  - JavaScript 코드 모듈화
  - 함수 리팩토링
- 스타일 개선
  - 반응형 디자인 등 스타일 개선
- 에러 처리 추가
  - 서버와의 통신이 실패할 경우 사용자에게 적절한 오류 메시지를 표시하도록 에러 처리
  
<br> 
  
# 배포
- https://cloudtype.io/ 활용 서버 배포(무료 버전 사용)
 ![](https://velog.velcdn.com/images/devysy55/post/bbf7ba7a-d606-4600-bd82-dd028869dc40/image.png)

