# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.profile_dto import ProfileDTO  # noqa: E501
from swagger_server.test import BaseTestCase


class TestSuperAdminEndpointsController(BaseTestCase):
    """SuperAdminEndpointsController integration test stubs"""

    def test_disable_user(self):
        """Test case for disable_user

        Disable user
        """
        query_string = [('email', 'email_example')]
        response = self.client.open(
            '/api/secured/super/disable-user',
            method='PUT',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_enable_user(self):
        """Test case for enable_user

        Enable user
        """
        query_string = [('email', 'email_example')]
        response = self.client.open(
            '/api/secured/super/enable-user',
            method='PUT',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_email(self):
        """Test case for get_user_by_email

        Get user by email
        """
        query_string = [('email', 'email_example')]
        response = self.client.open(
            '/api/secured/super/user',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
