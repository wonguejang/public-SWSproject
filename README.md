# 🎮 SWS Community Web Project

## 📖 프로젝트 소개
이 프로젝트는 **리그 오브 레전드(LoL)** 유저들을 위한 커뮤니티 웹 애플리케이션입니다.  
Spring MVC + Oracle DB 기반으로 제작되었으며, 자유게시판·패치게시판·빌드게시판·랭킹·소환사/챔피언 상세보기 등 다양한 기능을 구현했습니다.  
또한, 회원 관리(로그인/회원가입/비밀번호 재설정/소셜 로그인)와 댓글·추천 시스템을 통해 실제 서비스와 유사한 커뮤니티 환경을 제공합니다.  

---

## 🛠 Tech Stack  

### 🎨 Front-End
- HTML5 / CSS3 / JavaScript (ES6)  
- jQuery / AJAX  
- Chart.js (통계 시각화)  

### ⚙️ Back-End
- Java 11  
- Spring MVC / JSP  
- MyBatis / Lombok  

### 🗄 Database
- Oracle 11g  
- HikariCP (Connection Pool)  

### ☁️ Infra & Tools
- Apache Tomcat 9  
- AWS (배포 환경)  
- Maven (빌드 도구)  
- STS 3 (Spring Tool Suite IDE)  

### 🔗 External Services & Security
- Riot Games API (소환사 정보, 랭킹, 챔피언 상세 데이터)  
- Google OAuth 2.0 (소셜 로그인)  
- Kakao Login API (소셜 로그인)  
- JavaMailSender (SMTP) — 비밀번호 재설정 메일  
- BCryptPasswordEncoder — 비밀번호 암호화  

### 🧪 Testing
- JUnit  

---

## 👥 팀원 및 역할 — 장원규  

### 📌 자유게시판
- ✏️ 게시글 CRUD, 검색 및 페이지네이션  
- 💬 AJAX 기반 댓글 작성·삭제 (실시간 반영)  
- 👍/👎 추천·비추천 기능 (중복 방지 로직 포함)  
- 📝 마크다운 본문 지원 (Markdown → HTML 변환)  

### 🏠 홈 화면
- 🔄 Riot API 연동 — 로테이션 챔피언 출력  
- 📰 최신 자유게시판·빌드게시판 글 목록 미리보기  

### 🏆 랭킹
- 📊 Riot API 기반 소환사 랭킹 조회  
- 🔽 무한 스크롤 방식 데이터 로딩  
- 🗄️ 랭킹 DB 갱신 기능 구현  

### 🧙 챔피언 상세
- 🎯 Riot API 기반 챔피언 상세 정보 제공  
- ⚔️ 아이템·스킬·룬 빌드 데이터 시각화  
- 🚪 잘못된 검색어 입력 시 홈 화면 리다이렉트  

---

### 🚀 개발하며 겪은 도전 & 성장
이 프로젝트에서 가장 크게 성장한 부분은 **외부 API 문제를 근본적으로 해결한 경험**입니다.  
초기에 Riot Games API 키가 24시간마다 만료되어 서비스가 정상 동작하지 않는 문제가 있었는데, 단순히 DB 캐싱 같은 임시 대응 대신 **공식 문서를 탐색해 영구 API 키를 발급**받아 안정적으로 적용했습니다. 이후에도 **호출 제한(Rate Limit)** 문제에 부딪혔지만, DB 캐싱과 호출 최소화 전략을 반복적으로 최적화하며 **안정성과 성능을 동시에 확보**했습니다.  

➡️ 이 과정을 통해 단순 CRUD를 넘어서, 실제 서비스 환경에서 **외부 API를 안정적으로 운영하는 방법**과 **근본적인 해결책을 찾는 태도**를 배울 수 있었습니다.  

---

### **성현철**
- **소환사 상세 페이지**
  - Riot API 기반 최근 전적(100경기) 데이터 수집·DB 저장  
  - 소환사 프로필, 대표 챔피언, 아이템·룬·스펠·스킬 빌드 시각화  
  - 전적 세부 통계(totalDetailDto) 가공 및 출력  
- **빌드 게시판**
  - 챔피언/아이템/룬/스펠 기반 빌드 공유 기능  
  - 게시글 CRUD, 추천, 댓글 기능 구현  
  - AJAX 기반 이미지 검색(챔피언, 아이템, 룬, 스펠)으로 빌드 작성 지원  
- **웹소켓(WebSocket)**
  - 실시간 알림/채팅 기능을 고려한 WebSocket 환경 구축  

---

### **나상우**
- **패치 게시판**
  - 공지/패치 노트 게시글 CRUD 구현  
  - 조회수 증가, 추천/비추천 기능  
  - 댓글 CRUD 및 권한 기반 삭제 기능  
  - 본문 마크다운 렌더링 적용  
- **로그인/로그아웃**
  - 세션 기반 사용자 인증 및 권한 관리  
  - 회원가입 시 아이디 중복 검사, 비밀번호 암호화(BCrypt)  
  - 마이페이지 닉네임 변경 기능  
  - 구글/카카오 소셜 로그인 연동 (OAuth 2.0)  
  - 이메일 인증 기반 비밀번호 재설정 (SMTP, 토큰 방식)  

---


---

## 🌍 배포 주소 (Demo URL)
- **서비스 URL**: [https://swsggwp.co.kr](https://swsggwp.co.kr)  
- 테스트 계정  
  - ID: `test@test.com`  
  - PW: `1234`  

---

## 📑 프로젝트 문서
- **API 명세서 (Notion)**: [[API 명세서](https://www.notion.so/SWS-Community-Web-Project-247e75a00e2f8000976bdf7f171c43a0)]  


---

## 🚀 실행 방법
```bash
# 1. 프로젝트 클론
git clone https://github.com/username/repo.git

# 2. DB 설정 (Oracle XE)
- user/schema 생성
- 제공된 SQL 스크립트 실행(라이엇 데이터 드레곤 이용 또는 )

# 3. Maven 빌드
mvn clean install

# 4. Tomcat 배포
war 파일을 Tomcat webapps에 배치 후 실행

# 5. 접속
http://localhost:8080/
