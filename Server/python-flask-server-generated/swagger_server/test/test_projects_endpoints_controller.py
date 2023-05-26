# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.assign_project_dto import AssignProjectDTO  # noqa: E501
from swagger_server.models.create_project_dto import CreateProjectDTO  # noqa: E501
from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.project_info_dto import ProjectInfoDTO  # noqa: E501
from swagger_server.models.submit_offer_dto import SubmitOfferDTO  # noqa: E501
from swagger_server.test import BaseTestCase


class TestProjectsEndpointsController(BaseTestCase):
    """ProjectsEndpointsController integration test stubs"""

    def test_assign_freelancer(self):
        """Test case for assign_freelancer

        Assign freelancer
        """
        body = AssignProjectDTO()
        response = self.client.open(
            '/api/secured/projects/client/assignFreelancer',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project(self):
        """Test case for create_project

        Create project
        """
        body = CreateProjectDTO()
        response = self.client.open(
            '/api/secured/projects/client/createProject',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_finish_project(self):
        """Test case for finish_project

        Finish project
        """
        query_string = [('id', 'id_example')]
        response = self.client.open(
            '/api/secured/projects/client/finishProject',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_in_progress_projects_by_client_id(self):
        """Test case for get_in_progress_projects_by_client_id

        Get the projects I have created that are in progress
        """
        response = self.client.open(
            '/api/secured/projects/client/getMyInProgressProjects',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_open_projects(self):
        """Test case for get_open_projects

        Get all open projects
        """
        response = self.client.open(
            '/api/secured/projects/openProjects',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_open_projects_by_client(self):
        """Test case for get_open_projects_by_client

        Get the projects I have created that are open
        """
        response = self.client.open(
            '/api/secured/projects/client/getMyOpenProjects',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_open_projects_by_skills(self):
        """Test case for get_open_projects_by_skills

        Get open projects by skills
        """
        body = ['body_example']
        response = self.client.open(
            '/api/secured/projects/openProjectsBySkills',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_prject_info(self):
        """Test case for get_prject_info

        Get project info
        """
        query_string = [('id', 'id_example')]
        response = self.client.open(
            '/api/secured/projects/projectInfo',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_by_assigned_freelancer(self):
        """Test case for get_projects_by_assigned_freelancer

        Get projects assigned to me
        """
        response = self.client.open(
            '/api/secured/projects/freelancer/getProjectsAssignedToMe',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_by_client(self):
        """Test case for get_projects_by_client

        Get the projects I have created
        """
        response = self.client.open(
            '/api/secured/projects/client/myProjects',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_by_offer_freelancer(self):
        """Test case for get_projects_by_offer_freelancer

        Get projects where I have made an offer
        """
        response = self.client.open(
            '/api/secured/projects/freelancer/getProjectsWhereIHaveOffer',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_submit_offer(self):
        """Test case for submit_offer

        Submit offer
        """
        body = SubmitOfferDTO()
        response = self.client.open(
            '/api/secured/projects/freelancer/submitOffer',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
