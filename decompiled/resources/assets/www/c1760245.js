import{z as t,aE as s,a,aF as o,aT as i,ak as r}from"./952f98a9.js";import"./7f3d7ca9.js";var n=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
`;const e={light:t`
    ${s.light}
  `,dark:t`
    ${s.dark}
  `};class c extends(a(o)){static get is(){return"bbva-form-contact"}constructor(){super(),this.actionIcon=i(),this.actionIntoForm=!0,this.actionType="button",this.actionVariant="no-background"}static get styles(){return[super.styles,n,r("bbva-form-contact-shared-styles"),e.light,e.dark]}}export{c as B};
