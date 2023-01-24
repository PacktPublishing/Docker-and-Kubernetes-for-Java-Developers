


# Docker and Kubernetes for Java Developers
This is the code repository for [Docker and Kubernetes for Java Developers](https://www.packtpub.com/virtualization-and-cloud/docker-and-kubernetes-java-developers?utm_source=repository&utm_medium=github&utm_campaign=repository&utm_term=9781786468390). It contains all the supporting project files necessary to work through the book from start to finish.

## About the Book
This book will start by introducing Docker and delve deep into its networking and persistent storage concepts. You will then proceed to learn how to refactor monolith application into separate services by building an application and then packaging it into Docker containers. Next, you will create an image containing Java Enterprise Application and later run it using Docker. Moving on, the book will focus on Kubernetes and its features and you will learn to deploy a Java application to Kubernetes using Maven and monitor a Java application in production. By the end of the book, you will get hands-on with some more advanced topics to further extend your knowledge about Docker and Kubernetes.


## Instructions and Navigation
All of the code is organized into folder.

The code will look like the following:
```
 {
"apiVersion": "v1",
"kind": "Pod",
"metadata":{
"name": ”rest_service”,
"labels": {
"name": "rest_service"
}
},
"spec": {
"containers": [{
"name": "rest_service",
"image": "rest_service",
"ports": [{"containerPort": 8080}],
}]
}
}

```

## Related Products
* [DevOps: Puppet, Docker, and Kubernetes](https://www.packtpub.com/virtualization-and-cloud/devops-puppet-docker-and-kubernetes?utm_source=repository&utm_medium=github&utm_campaign=repository&utm_term=9781788297615)

* [Docker for Web Developers [Video]](https://www.packtpub.com/virtualization-and-cloud/docker-web-developers-video?utm_source=repository&utm_medium=github&utm_campaign=repository&utm_term=9781786465931)

* [Docker: Creating Structured Containers](https://www.packtpub.com/virtualization-and-cloud/docker-creating-structured-containers?utm_source=repository&utm_medium=github&utm_campaign=repository&utm_term=9781786465931)

### Download a free PDF

 <i>If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no cost.<br>Simply click on the link to claim your free PDF.</i>
<p align="center"> <a href="https://packt.link/free-ebook/9781786468390">https://packt.link/free-ebook/9781786468390 </a> </p>