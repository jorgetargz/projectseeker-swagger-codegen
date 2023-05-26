'use strict';


/**
 * Assign freelancer
 *
 * body AssignProjectDTO 
 * returns ProjectInfoDTO
 **/
exports.assignFreelancer = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create project
 *
 * body CreateProjectDTO 
 * returns ProjectInfoDTO
 **/
exports.createProject = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Finish project
 *
 * id String 
 * returns ProjectInfoDTO
 **/
exports.finishProject = function(id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get the projects I have created that are in progress
 *
 * returns List
 **/
exports.getInProgressProjectsByClientId = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all open projects
 *
 * returns List
 **/
exports.getOpenProjects = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get the projects I have created that are open
 *
 * returns List
 **/
exports.getOpenProjectsByClient = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get open projects by skills
 *
 * body List 
 * returns List
 **/
exports.getOpenProjectsBySkills = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get project info
 *
 * id String 
 * returns ProjectInfoDTO
 **/
exports.getPrjectInfo = function(id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get projects assigned to me
 *
 * returns List
 **/
exports.getProjectsByAssignedFreelancer = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get the projects I have created
 *
 * returns List
 **/
exports.getProjectsByClient = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get projects where I have made an offer
 *
 * returns List
 **/
exports.getProjectsByOfferFreelancer = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
}, {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Submit offer
 *
 * body SubmitOfferDTO 
 * returns ProjectInfoDTO
 **/
exports.submitOffer = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "offers" : [ {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  }, {
    "freelancerId" : "freelancerId",
    "description" : "description",
    "budget" : 1.4658129805029452,
    "status" : "status"
  } ],
  "clientId" : "clientId",
  "deadlineDate" : "2000-01-23",
  "description" : "description",
  "maxBudget" : 6.027456183070403,
  "realEndDate" : "2000-01-23",
  "title" : "title",
  "selectedFreelancerId" : "selectedFreelancerId",
  "skills" : [ "skills", "skills" ],
  "id" : "id",
  "minBudget" : 0.8008281904610115,
  "startDate" : "2000-01-23",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

