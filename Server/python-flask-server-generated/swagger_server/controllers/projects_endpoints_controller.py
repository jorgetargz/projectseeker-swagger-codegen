import connexion
import six

from swagger_server.models.assign_project_dto import AssignProjectDTO  # noqa: E501
from swagger_server.models.create_project_dto import CreateProjectDTO  # noqa: E501
from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.project_info_dto import ProjectInfoDTO  # noqa: E501
from swagger_server.models.submit_offer_dto import SubmitOfferDTO  # noqa: E501
from swagger_server import util


def assign_freelancer(body):  # noqa: E501
    """Assign freelancer

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProjectInfoDTO
    """
    if connexion.request.is_json:
        body = AssignProjectDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_project(body):  # noqa: E501
    """Create project

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProjectInfoDTO
    """
    if connexion.request.is_json:
        body = CreateProjectDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def finish_project(id):  # noqa: E501
    """Finish project

     # noqa: E501

    :param id: 
    :type id: str

    :rtype: ProjectInfoDTO
    """
    return 'do some magic!'


def get_in_progress_projects_by_client_id():  # noqa: E501
    """Get the projects I have created that are in progress

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_open_projects():  # noqa: E501
    """Get all open projects

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_open_projects_by_client():  # noqa: E501
    """Get the projects I have created that are open

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_open_projects_by_skills(body):  # noqa: E501
    """Get open projects by skills

     # noqa: E501

    :param body: 
    :type body: List[]

    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_prject_info(id):  # noqa: E501
    """Get project info

     # noqa: E501

    :param id: 
    :type id: str

    :rtype: ProjectInfoDTO
    """
    return 'do some magic!'


def get_projects_by_assigned_freelancer():  # noqa: E501
    """Get projects assigned to me

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_projects_by_client():  # noqa: E501
    """Get the projects I have created

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def get_projects_by_offer_freelancer():  # noqa: E501
    """Get projects where I have made an offer

     # noqa: E501


    :rtype: List[ProjectInfoDTO]
    """
    return 'do some magic!'


def submit_offer(body):  # noqa: E501
    """Submit offer

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProjectInfoDTO
    """
    if connexion.request.is_json:
        body = SubmitOfferDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
