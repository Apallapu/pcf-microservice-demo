# Pcf-microservice-demo

Steps to Deploy micro service in pcf
=======================================
step1:create pivotal account in pivotal website.below use below url for create account

https://account.run.pivotal.io/z/uaa/sign-up


step2: DownLoad and install the cli for pcf

https://docs.cloudfoundry.org/cf-cli/install-go-cli.html#windows

step3:cf login

Here we have to login pcf with register mail id and password

step4:create service for registry

$ cf create-service p-service-registry trial my-service-registry

step5:create manifest file for deploy the micro service

example manifest file

manifest.yml
................
applications:
- name: pcf-client-application
  memory: 1G
  instances: 1
  host: pcf-client-application
  path: target/pcf-demo-client-0.0.1-SNAPSHOT.jar
  services:
    - my-service-registry

step6:cf push

it automatically deploy and bind with service-registry in pcf

Note:after deploying micro service in pcf,remove instance in pcf with beloe command

cf delete pcf-client-application


Second way of deploying micro service in pcf without manifest.yml file
=======================================================================

step1:
cf push -p target\pcf-demo-0.0.1-SNAPSHOT.jar pcf-ui-application

step2:cf create-service p-service-registry trial my-service-registry

step3:cf bind-service pcf-ui-application my-service-registry

step4: cf restage pcf-ui-application

ote:after deploying micro service in pcf,remove instance in pcf with beloe command

cf delete pcf-client-application
