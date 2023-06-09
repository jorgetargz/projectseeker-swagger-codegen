/* 
 * Project Seeker API
 *
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing UsersEndpointsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class UsersEndpointsApiTests
    {
        private UsersEndpointsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new UsersEndpointsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UsersEndpointsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' UsersEndpointsApi
            //Assert.IsInstanceOfType(typeof(UsersEndpointsApi), instance, "instance is a UsersEndpointsApi");
        }

        /// <summary>
        /// Test AddOrUpdateDeviceFCMToken
        /// </summary>
        [Test]
        public void AddOrUpdateDeviceFCMTokenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AddDeviceDTO body = null;
            //instance.AddOrUpdateDeviceFCMToken(body);
            
        }
        /// <summary>
        /// Test ChangeRole
        /// </summary>
        [Test]
        public void ChangeRoleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ChangeUserRoleDTO body = null;
            //var response = instance.ChangeRole(body);
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
        /// <summary>
        /// Test CreateUser
        /// </summary>
        [Test]
        public void CreateUserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateUserDTO body = null;
            //var response = instance.CreateUser(body);
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
        /// <summary>
        /// Test DeleteUser
        /// </summary>
        [Test]
        public void DeleteUserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.DeleteUser();
            
        }
        /// <summary>
        /// Test GetMyProfile
        /// </summary>
        [Test]
        public void GetMyProfileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetMyProfile();
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
        /// <summary>
        /// Test GetProfile
        /// </summary>
        [Test]
        public void GetProfileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetProfile(id);
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
        /// <summary>
        /// Test ModifyClientProfile
        /// </summary>
        [Test]
        public void ModifyClientProfileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModifyClientProfileDTO body = null;
            //var response = instance.ModifyClientProfile(body);
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
        /// <summary>
        /// Test ModifyFreelancerProfile
        /// </summary>
        [Test]
        public void ModifyFreelancerProfileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModifyFreelancerProfileDTO body = null;
            //var response = instance.ModifyFreelancerProfile(body);
            //Assert.IsInstanceOf<ProfileDTO> (response, "response is ProfileDTO");
        }
    }

}
