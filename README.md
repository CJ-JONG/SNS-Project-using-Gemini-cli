1 # SNS Project using Gemini CLI                                                          
    2                                                                                         
    3 ## 프로젝트 설명                                                                        
    4                                                                                         
    5 이 프로젝트는 Gemini CLI 에이전트의 도움을 받아 구축된 기본적인 소셜 네트워킹 서비스(SNS
      백엔드 애플리케이션입니다. 사용자 등록, 보안 구성 등 핵심 기능을 제공하며, 향후 SNS의   
      다양한 기능을 확장할 수 있는 기반을 마련합니다.
    6                                                                                         
    7 ## 주요 기능                                                                            
    8                                                                                         
    9 현재 구현된 주요 기능은 다음과 같습니다:
   10                                                                                         
   11 *   사용자 등록: 새로운 사용자가 사용자 이름과 비밀번호로 계정을 생성할 수 있습니다.
   12 *   보안: 비밀번호는 강력한 Argon2 알고리즘으로 인코딩됩니다.
   13 *   **기본 Spring Security 설정**: `/api/**` 경로에 대한 접근을 허용하는 기본적인 Spring
      Security 필터 체인이 구성되어 있습니다.
   14                                                                                         
   15 ## 사용 기술                                                                            
   16                                                                                         
   17 *   **Spring Boot**: 3.3.1
   18 *   **Java**: 17
   19 *   **빌드 도구**: Gradle
   20 *   **데이터베이스**: Spring Data JPA
   21 *   **웹**: Spring Web (Spring MVC)
   22 *   **보안**: Spring Security (Argon2PasswordEncoder 포함)
   23 *   **유틸리티**: Lombok
   24 *   **개발용 DB**: H2 Database
   25 *   **운영용 DB**: PostgreSQL (설정 가능)
