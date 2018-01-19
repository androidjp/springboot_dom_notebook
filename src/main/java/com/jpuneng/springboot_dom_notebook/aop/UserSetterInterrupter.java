package com.jpuneng.springboot_dom_notebook.aop;

import com.jpuneng.springboot_dom_notebook.po.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class UserSetterInterrupter {
  private static final String LOGGER = UserSetterInterrupter.class.getName();

  @Pointcut("execution(* com.jpuneng.springboot_dom_notebook.dao.user.UserDAO.updateUser(..))")
  public void userUpdatePointCut() {
  }

  @Pointcut("execution(* com.jpuneng.springboot_dom_notebook.dao.user.UserDAO.saveUser(..))")
  public void userGeneratePointCut() {

  }

  @Before("userGeneratePointCut()")
  public void beforeSaveUser(JoinPoint joinPoint) {
    User user = (User) joinPoint.getArgs()[0];
    System.out.println("---------------------------");
    System.out.println("CreateTime for USER : " + user.toString());
    System.out.println("---------------------------");
    user.setCreateTime(new Date());
  }

  @Before("userUpdatePointCut()")
  public void beforeUpdateUser(JoinPoint joinPoint) {
    User user = (User) joinPoint.getArgs()[0];
    System.out.println("---------------------------");
    System.out.println("updateTime for USER : " + user.toString());
    System.out.println("---------------------------");
    user.setUpdateTime(new Date());
  }

  //  @Around("userSetterPointCut()")
  //  public Object intercept(ProceedingJoinPoint pjp) {
  //    MethodSignature signature = (MethodSignature) pjp.getSignature();
  //    Method method = signature.getMethod();
  //    String methodName = method.getName();
  //
  //    User user = (User) pjp.getArgs()[0];
  //
  //    System.out.println(LOGGER + "[Method call]: " + methodName);
  //    System.out.println(LOGGER + "[Target  obj]: " + user.toString());
  //
  //    if (methodName.equals("saveUser")) {
  //      user.setCreateTime(new Date());
  //    }
  //    return pjp;
  //  }

}
