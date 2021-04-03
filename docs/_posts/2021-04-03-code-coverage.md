---
title: "Code Coverage"

categroies:
  - Blog
tags:
  - Blog
---

## Code Coverage 측정
Code Coverage 는 테스트를 진행했을때 코드 자체가 얼마나 실행되었는지 측정하는 것이다.
코드는 구문(Statement), 조건(Condition), 결정(Decision) 으로 이루어진다. 이 세가지 항목을 얼마나 커버했느냐에 따라 측정값이 달라진다. 일반적으로 많이 사용되는 커버리지는 구문(Statement)커버리지이며, 실행 코드라인이 한번 이상 실행 되면 충족된다. 조건(Condition)커버리지는 각 내부 조건이 참 혹은 거짓을 가지면 충족된다. 결정(Decision) 커버리지는 각 분기의 내부 조건자체가 아닌 이러한 조건으로 인해 전체 결과가 참 혹은 거짓이면 충족된다. 

## JaCoCo
JaCoCo 는 Java Code Coverage 를 측정하는 오픈소스 라이브러리다. 테스트 결과에 따라 xml, html 형태로 보고서가 작성된다. 또한 목표하는 커버리지를 설정하고, 이를 만족하는지 확인 할 수 있다.

## Codecov
Codecov 는 Code Coverage 결과를 통합 관리하고, Github / Circle CI / Slack 등과 연동하여 사용할 수 있는 편의를 제공한다. 주로 Github PR 분석, PR Block, Merging Report 의 용도로 사용 한다. 

## JaCoCo 설정
*  Gradle 설정에 플러그인 추가 / 설정 진행  
[(상세 설정은 본 포스트 하단 참조.)](#참고)  
```groovy
plugins {
    id 'jacoco'
}

jacoco {
    toolVersion = "0.8.5"
}

jacocoTestReport {
    reports {
        xml.enabled = true // codecov depends on xml format report
        html.enabled = true
    }
}

acocoTestCoverageVerification {
    violationRules {
        rule {
            element = 'CLASS'
            limit {
                counter = 'METHOD'
                value = 'COVEREDRATIO'
                minimum = 0.90
            }
        }
    }
}
```
* gradle test 수행을 통해 정상 작동 확인  
 ./build/report 경로에 정상적으로 jacoco 리포트가 생성 되었는지 확인한다.
```shell script 
gradle test jacocoTestReport jacocoTestCoverageVerification
```

## Codecov 사용법
* [Codecov 홈페이지](https://about.codecov.io/) 로 이동
* Codecov 가입 / 로그인 진행
* Codecov 를 사용할 계정 / Repository 선택 후 Codecov Token 복사  
![get token](./assets/images/posts/codecovTokenCopy.PNG)


## 참고
##### JaCoCo
https://docs.gradle.org/current/userguide/jacoco_plugin.html  
https://woowabros.github.io/experience/2020/02/02/jacoco-config-on-gradle-project.html
##### Code Coverage
https://woowacourse.github.io/javable/post/2020-10-24-code-coverage/
