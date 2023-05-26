# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.add_device_dto import AddDeviceDTO  # noqa: E501
from swagger_server.models.change_user_role_dto import ChangeUserRoleDTO  # noqa: E501
from swagger_server.models.create_user_dto import CreateUserDTO  # noqa: E501
from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.modify_client_profile_dto import ModifyClientProfileDTO  # noqa: E501
from swagger_server.models.modify_freelancer_profile_dto import ModifyFreelancerProfileDTO  # noqa: E501
from swagger_server.models.profile_dto import ProfileDTO  # noqa: E501
from swagger_server.test import BaseTestCase


class TestUsersEndpointsController(BaseTestCase):
    """UsersEndpointsController integration test stubs"""

    def test_add_or_update_device_fcm_token(self):
        """Test case for add_or_update_device_fcm_token

        Add device for notifications
        """
        body = AddDeviceDTO()
        response = self.client.open(
            '/api/secured/users/addDevice',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_change_role(self):
        """Test case for change_role

        Change user role
        """
        body = ChangeUserRoleDTO()
        response = self.client.open(
            '/api/secured/users/changeRole',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_user(self):
        """Test case for create_user

        Create user
        """
        body = CreateUserDTO()
        response = self.client.open(
            '/api/secured/users/createUser',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_user(self):
        """Test case for delete_user

        Delete user
        """
        response = self.client.open(
            '/api/secured/users/deleteUser',
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_my_profile(self):
        """Test case for get_my_profile

        Get my profile
        """
        response = self.client.open(
            '/api/secured/users/myProfile',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_profile(self):
        """Test case for get_profile

        Get profile
        """
        query_string = [('id', 'id_example')]
        response = self.client.open(
            '/api/secured/users/profile',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_client_profile(self):
        """Test case for modify_client_profile

        Modify client profile
        """
        body = ModifyClientProfileDTO()
        response = self.client.open(
            '/api/secured/users/modifyClientProfile',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_freelancer_profile(self):
        """Test case for modify_freelancer_profile

        Modify freelancer profile
        """
        body = ModifyFreelancerProfileDTO()
        response = self.client.open(
            '/api/secured/users/modifyFreelancerProfile',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
