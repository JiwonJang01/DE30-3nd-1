# 편지가 도착했습니다

![](https://velog.velcdn.com/images/devysy55/post/d9322d56-34ae-41b9-8a06-ca71a931510b/image.png)

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


<br>
<br>

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

