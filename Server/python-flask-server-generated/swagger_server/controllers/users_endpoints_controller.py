import connexion
import six

from swagger_server.models.add_device_dto import AddDeviceDTO  # noqa: E501
from swagger_server.models.change_user_role_dto import ChangeUserRoleDTO  # noqa: E501
from swagger_server.models.create_user_dto import CreateUserDTO  # noqa: E501
from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.modify_client_profile_dto import ModifyClientProfileDTO  # noqa: E501
from swagger_server.models.modify_freelancer_profile_dto import ModifyFreelancerProfileDTO  # noqa: E501
from swagger_server.models.profile_dto import ProfileDTO  # noqa: E501
from swagger_server import util


def add_or_update_device_fcm_token(body):  # noqa: E501
    """Add device for notifications

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = AddDeviceDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def change_role(body):  # noqa: E501
    """Change user role

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProfileDTO
    """
    if connexion.request.is_json:
        body = ChangeUserRoleDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_user(body):  # noqa: E501
    """Create user

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProfileDTO
    """
    if connexion.request.is_json:
        body = CreateUserDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_user():  # noqa: E501
    """Delete user

     # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def get_my_profile():  # noqa: E501
    """Get my profile

     # noqa: E501


    :rtype: ProfileDTO
    """
    return 'do some magic!'


def get_profile(id):  # noqa: E501
    """Get profile

     # noqa: E501

    :param id: 
    :type id: str

    :rtype: ProfileDTO
    """
    return 'do some magic!'


def modify_client_profile(body):  # noqa: E501
    """Modify client profile

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProfileDTO
    """
    if connexion.request.is_json:
        body = ModifyClientProfileDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def modify_freelancer_profile(body):  # noqa: E501
    """Modify freelancer profile

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ProfileDTO
    """
    if connexion.request.is_json:
        body = ModifyFreelancerProfileDTO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
