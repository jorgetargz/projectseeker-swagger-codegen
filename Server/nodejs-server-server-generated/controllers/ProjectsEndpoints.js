'use strict';

var utils = require('../utils/writer.js');
var ProjectsEndpoints = require('../service/ProjectsEndpointsService');

module.exports.assignFreelancer = function assignFreelancer (req, res, next, body) {
  ProjectsEndpoints.assignFreelancer(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createProject = function createProject (req, res, next, body) {
  ProjectsEndpoints.createProject(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.finishProject = function finishProject (req, res, next, id) {
  ProjectsEndpoints.finishProject(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInProgressProjectsByClientId = function getInProgressProjectsByClientId (req, res, next) {
  ProjectsEndpoints.getInProgressProjectsByClientId()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOpenProjects = function getOpenProjects (req, res, next) {
  ProjectsEndpoints.getOpenProjects()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOpenProjectsByClient = function getOpenProjectsByClient (req, res, next) {
  ProjectsEndpoints.getOpenProjectsByClient()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOpenProjectsBySkills = function getOpenProjectsBySkills (req, res, next, body) {
  ProjectsEndpoints.getOpenProjectsBySkills(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getPrjectInfo = function getPrjectInfo (req, res, next, id) {
  ProjectsEndpoints.getPrjectInfo(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProjectsByAssignedFreelancer = function getProjectsByAssignedFreelancer (req, res, next) {
  ProjectsEndpoints.getProjectsByAssignedFreelancer()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProjectsByClient = function getProjectsByClient (req, res, next) {
  ProjectsEndpoints.getProjectsByClient()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProjectsByOfferFreelancer = function getProjectsByOfferFreelancer (req, res, next) {
  ProjectsEndpoints.getProjectsByOfferFreelancer()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.submitOffer = function submitOffer (req, res, next, body) {
  ProjectsEndpoints.submitOffer(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
