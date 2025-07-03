# 보인당
<img src="https://github.com/user-attachments/assets/b4ca15b7-ac10-42a2-9d72-b337c54dfe39">

## 목차
1. [프로젝트 소개](#프로젝트-소개)
2. [주요 기능](#주요-기능)
3. [화면 구성](#화면-구성)
4. [아키텍처](#아키텍처)
5. [기술 스택](#기술-스택)
6. [팀원 정보](#팀원-정보)


## 프로젝트 소개
**보인당(Boindang)**은 알기 어려운 식품 성분을 OCR 기반으로 간편하게 확인할 수 있도록 돕는 서비스입니다.

제품의 영양정보 표를 촬영하여 원재료 정보 및 사용자 타입별 리포트를 제공받아,
'저당', '무가당' 같은 문구에 현혹되지 않고, **제품에 포함된 숨겨진 첨가물 정보(특히 대체당)**를 한눈에 파악하여
혈당관리 및 건강관리에 도움을 줍니다.

많은 제품이 표기법상 당류로 분류되지 않는 대체당을 사용해 '저당'으로 판매되지만, 이는 혈당에 영향을 줄 수 있습니다.
**보인당**은 이러한 문제점을 해결하여, 당 관련 질환을 앓고 있거나 혈당 관리를 하는 소비자들이 겉 포장 문구가 아닌 **실제 성분에 기반한 현명한 제품 선택**을 할 수 있도록 지원하는 것을 **목표**로 합니다.

### 프로젝트 정보
| 항목 | 내용 |
|---|---|
| 서비스명 | 보인당 |
| 개발 기간 | 2025.04.14. ~ 2025.05.22. (6주) |
| 개발 인원 | 총 6명 (백엔드 3명, 프론트 3명) |




## 주요 기능
### 1. OCR 기반 영양성분 분석
OCR을 이용해 제품의 영양정보를 촬영하면 텍스트 추출, 정제, DB 매칭의 과정을 거쳐 영양성분 목록을 생성합니다.
이를 기반으로 제품의 영양성분 분석 리포트를 제공합니다.

### 2. 유저 타입별 맞춤 정보 제공
사용자별로 설정된 관심사에 따라 주의해야할 성분을 파악하여 제공합니다.

### 3. 성분 백과사전
제품 촬영 없이 식품성분에 대한 정보를 검색할 수 있습니다.
실시간 검색어를 통해 어떤 성분이 자주 검색되는지 확인할 수 있습니다.




## 화면 구성
### 1. 메인 기능(영양성분 분석)
| <img src="https://github.com/user-attachments/assets/86efae9a-ee27-4099-8850-0d5950008f3c" width="200"> | <img src="https://github.com/user-attachments/assets/f9a51906-6bb7-415d-8bf2-5b8f2f24e621" width="200"> | <img src="https://github.com/user-attachments/assets/e4fa70f6-6456-4554-805e-dfe2c0173b52" width="200"> | <img src="https://github.com/user-attachments/assets/b6cde0a3-dc87-4633-8d05-27884a0adbc9" width="200"> |
|---|---|---|---|
| 메인화면 | 촬영 가이드 | 분석 진행 화면 | 리포트 요약 |

### 2. 리포트 상세보기
| <img src="https://github.com/user-attachments/assets/0d0c32a2-4dd7-4308-a223-e3a188586429" width="200"> | <img src="https://github.com/user-attachments/assets/8007e66d-2eb4-46f9-bc87-0e23b824f0e1" width="200"> | <img src="https://github.com/user-attachments/assets/80fae755-b387-4f1f-9d6e-900951f15c1d" width="200">  |
|---|---|---|
| 안전도 체크 | 성분 구성 | 유저 타입별 주의 성분 | 

### 3. 성분 백과사전
| <img src="https://github.com/user-attachments/assets/dc26d5d4-01cb-42a3-a11b-bbd006596605" width="200"> | <img src="https://github.com/user-attachments/assets/61b48e2b-cded-4a47-bd71-0169abb73857" width="200"> | <img src="https://github.com/user-attachments/assets/46878262-12b9-4ec9-ba78-1ca553a64985" width="200"> |
|---|---|---|
| 백과사전 메인화면 | 성분 검색 | 성분 상세 정보 | 

### 4. 기타
| <img src="https://github.com/user-attachments/assets/6a3e4fa4-70b0-4a9c-ae6d-2074c3e03462" width="200"> | <img src="https://github.com/user-attachments/assets/cb550574-68d2-40a3-b020-05f8d27bfca4" width="200"> |
|---|---|
| 영양 퀴즈 | 분석 완료 알림 |



## 아키텍처
![Image](https://github.com/user-attachments/assets/5efb7c54-956d-427e-aa88-ebf65956ff38)



## 기술 스택
### **Frontend**
<span>
  <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" />
  <img src="https://img.shields.io/badge/Next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white" />
  <img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white" />
</span>

### 2. **Backend**
<span>
  <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Cloud Gateway-6DB33F?style=for-the-badge&logo=Spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Eureka-6DB33F?style=for-the-badge&logo=Spring&logoColor=white" />
  <img src="https://img.shields.io/badge/FastAPI-009688?style=for-the-badge&logo=fastapi&logoColor=white" />
</span>
<span>
  <img src="https://img.shields.io/badge/Apache Kafka-231F20?style=for-the-badge&logo=apachekafka&logoColor=white"> 
  <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=Redis&logoColor=white">
  <img src="https://img.shields.io/badge/Elasticsearch-005571?style=for-the-badge&logo=Elasticsearch&logoColor=white">
  <img src="https://img.shields.io/badge/Kibana-005571?style=for-the-badge&logo=Kibana&logoColor=white">
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
  <img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white">  
</span>

### 3. **CI/CD, Monitoring**
<span>
  <img src="https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white">
  <img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white">
  <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white">
  <img src="https://img.shields.io/badge/Amazon%20EC2-FF9900?style=for-the-badge&logo=Amazon%20EC2&logoColor=white">
  <img src="https://img.shields.io/badge/Amazon%20S3-569A31?style=for-the-badge&logo=Amazon%20S3&logoColor=white">
</span>
<br>
<span>
  <img src="https://img.shields.io/badge/Prometheus-E6522C?style=for-the-badge&logo=Prometheus&logoColor=white">
  <img src="https://img.shields.io/badge/grafana-%23F46800.svg?style=for-the-badge&logo=grafana&logoColor=white">
</span>

### **Communication**
<img src="https://img.shields.io/badge/Git(Gitlab)-FCA121?style=for-the-badge&logo=Gitlab&logoColor=white"> <img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira&logoColor=white"> <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white"> <img src="https://img.shields.io/badge/Mattermost-0058CC?style=for-the-badge&logo=Mattermost&logoColor=white"> <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=Figma&logoColor=white"> <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">



## 팀원 정보
<img src="https://github.com/user-attachments/assets/b0da4f98-b2f7-42f2-8f50-01c01e7dc2a4" width="500">

| 이름 | 역할 | 이름 | 역할 |
|---|---|---|---|
| [김유진](https://github.com/zladb) | Backend, OCR | [권가영](https://github.com/gayeong718) | Frontend |
| [김휘동](https://github.com/HwiDong6831) | Backend, Infra | [서유민](https://github.com/sennaseo) | Frontend |
| [정나금](https://github.com/gomie1) | Backend, DB |  [신은찬](https://github.com/eunchan0324) | Frontend |


