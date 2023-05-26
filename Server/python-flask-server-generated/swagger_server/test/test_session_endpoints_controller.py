# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.test import BaseTestCase


class TestSessionEndpointsController(BaseTestCase):
    """SessionEndpointsController integration test stubs"""

    def test_session_login(self):
        """Test case for session_login

        Login user with firebase token and create session cookie
        """
        response = self.client.open(
            '/api/session/login',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_session_logout(self):
        """Test case for session_logout

        Logout user and delete session cookie
        """
        response = self.client.open(
            '/api/session/logout',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_session_logout_everywhere(self):
        """Test case for session_logout_everywhere

        Logout user everywhere and delete session cookie
        """
        response = self.client.open(
            '/api/session/logout-everywhere',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
